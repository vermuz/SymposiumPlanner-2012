package ws.prova.mule.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.jms.ObjectMessage;

import org.activemq.message.ActiveMQTextMessage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.api.endpoint.EndpointBuilder;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.RecoverableException;
import org.mule.api.registry.MuleRegistry;
import org.mule.api.service.Service;
import org.mule.api.service.ServiceAware;
import org.mule.client.DefaultLocalMuleClient;
import org.mule.component.simple.LogComponent;
import org.mule.service.ServiceCompositeMessageSource;
import org.mule.transport.service.DefaultTransportServiceDescriptor;

import de.fub.csw.sparql.ProvaSparqlSelectPlugin;

import ws.prova.api2.ProvaCommunicator;
import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.esb2.ProvaAgent;
import ws.prova.kernel2.ProvaConstant;
import ws.prova.kernel2.ProvaList;
import ws.prova.plugin.registry.ProvaPluginRegistry;
import ws.prova.plugin.registry.impl.ProvaPluginRegistryImpl;
import ws.prova.reference2.ProvaConstantImpl;
import ws.prova.reference2.ProvaListImpl;

public class ProvaUMOImpl extends LogComponent implements Initialisable,
		Callable, ServiceAware, ProvaAgent {

	protected static transient Log logger = LogFactory
			.getLog(ProvaUMOImpl.class);

	private String agentName;
	private Service service;
	private ProvaCommunicator comm;
	private String tmpAgent;

	protected static ConcurrentMap<String, ProvaCommunicator> communicators = new ConcurrentHashMap<String, ProvaCommunicator>();

	/**
	 * Called once to set up this Prova message object
	 */
	public void initialise() throws InitialisationException,
			RecoverableException {
		ProvaPluginRegistry ppr = new ProvaPluginRegistryImpl();
		ppr.registerPlugin(new ProvaSparqlSelectPlugin());
		String rulebase = "";
		ServiceCompositeMessageSource source = (ServiceCompositeMessageSource) service
				.getMessageSource();
		Iterator iter = source.getEndpoints().iterator();
		while (iter.hasNext()) {
			ImmutableEndpoint endpoint = (ImmutableEndpoint) iter.next();
			if (endpoint.getProperties() != null) {
				if (endpoint.getProperties().containsKey("rulebase")) {
					rulebase = (String) endpoint.getProperties()
							.get("rulebase");
					agentName = endpoint.getName();
					break;
				}
			}
		}
		if (communicators.containsKey(agentName)) {
			comm = communicators.get(agentName);
			return;
		}

		try {
			comm = new ProvaCommunicatorImpl(agentName, null,rulebase,
					ProvaCommunicatorImpl.ASYNC, this, null);
			communicators.put(agentName, comm);
		} catch (Exception ex) {
			logger.error("Can not initialize Prova communicator");
			ex.printStackTrace();
			logger.error(ex);
		}
	}

	/**
	 * Process an inbound Prova RMessage that is assumed to arrive on this
	 * endpoint
	 */
	public Object onCall(MuleEventContext context) throws Exception {
		// Extract Prova RMessage
		MuleMessage inbound = context.getMessage();
		String temp = inbound.getPayloadAsString();
		// translate message into execution syntax
		ProvaList rMsg = null;
		try {
			if (inbound.getPayload() instanceof ObjectMessage) {
				Object message = ((ObjectMessage) inbound.getPayload())
						.getObject();
				if (message instanceof ProvaList)
					rMsg =  (ProvaList) message;
			} else if (inbound.getPayload() instanceof ActiveMQTextMessage) {
				// translate RuleML message to Prova message
				// TODO: might be move to config file (as an inbound endpoint
				// translator)
				RuleML2ProvaTranslator ruleml2prova = new RuleML2ProvaTranslator();
				Object message = ruleml2prova
						.transform(((ActiveMQTextMessage) context.getMessage()
								.getPayload()).getText());
				if (message instanceof ProvaList)
					rMsg = (ProvaList) message;
			} else if (inbound.getPayload() instanceof String) {
				// translate incoming RuleML message to Prova message
				// TODO: might be move to config file (as an inbound endpoint
				// translator)
				RuleML2ProvaTranslator ruleml2prova = new RuleML2ProvaTranslator();
				String http_message = URLDecoder.decode(
						inbound.getPayloadAsString(), inbound.getEncoding());
				if (http_message.indexOf("<") != -1) { // message comes from
														// HTTP request
					http_message = http_message.substring(http_message
							.indexOf("<")); // remove extra HTTP "parameter"
											// signs
				}
				Object message = ruleml2prova.transform(http_message);
				if (message instanceof ProvaList)
					rMsg = (ProvaListImpl) message;
			} else {
				Object message = context.getMessage().getPayload();
				if (message instanceof ProvaList)
					rMsg = (ProvaList) message;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("Translation of message into RMessage failed: "
					+ inbound);
			logger.error(ex);
		}

		if (rMsg == null) {
			// The message is not a RMessage or can not be translated into a
			// RMessage
			logger.error("Message has format: " + inbound);
			// TODO: Failure handling for wrong message formats
			return null; // do nothing
		}
		System.out.println("Message:" + rMsg);
		// Synchronous processing of queries in order to synchronously return
		// the results to synchronous requesters (e.g. a Web browser)
		if (inbound.getPayload() instanceof String) {
			// if not a synchronous query then add message to Prova Agent
			// Architecture (Prova AA)
			if (!rMsg.performative().equals("query-sync")) {
				comm.addMsg(rMsg);
				// context.setStopFurtherProcessing(true);
				return null;
			} else {
				int timeout = 10000; // default timeout
				// register temp. synchronous UMO agent
				// TODO: MAKE IT A LONGER TIMEOUT FOR RULEML2010
				//if (temp.contains("RuleML-2011")) {
					//System.out
							//.println("Timeout increase to 5 minutes for RuleML-2011. Will be reset upon new query.");
					//timeout = 300000;
				//}
				//===========================================================================
				if (temp.contains("RuleML-2012")) {
					System.out
							.println("Timeout increase to 5 minutes for RuleML-2012. Will be reset upon new query.");
					timeout = 300000;
				}
				//============================================================================
				if (temp.contains("RuleML-struct")) {
					System.out
							.println("Timeout increase to 5 minutes for RuleML-2012. Will be reset upon new query.");
					timeout = 300000;
				}
				
				//============================================================================
//				tmpAgent = ((ProvaConstant) rMsg.getFixed()[2]).toString();
				
//				String agent  = ((ProvaConstant) rMsg.getFixed()[2]).toString();
				tmpAgent = System.currentTimeMillis()+""; 
				
				rMsg.getFixed()[2] =ProvaConstantImpl.create(tmpAgent);

				// register the temporary object which acts as user
				try {
					MuleRegistry helper = service.getMuleContext()
							.getRegistry();
					EndpointBuilder builder = new DefaultTransportServiceDescriptor(
							tmpAgent, new Properties(), null)
							.createEndpointBuilder("jms://topic:" + tmpAgent);
					helper.registerEndpointBuilder(tmpAgent, builder);

				} catch (Exception e) {
					e.printStackTrace();
					context.setStopFurtherProcessing(true);
					return e.toString()
							+ " The user '"+tmpAgent+"'is already registered. Please use another user name as sender address."; // return
				}
				// collect synchronously all answers
				MuleMessage m = null;
				String answer = "";
				int i = 0;
				MuleClient client = new DefaultLocalMuleClient(
						service.getMuleContext());

				// Add the message to the
				// asynchronous Prova AA Communicator queue
				comm.addMsg(rMsg);
				context.setStopFurtherProcessing(true);
				do {
					m = client.request("jms://topic:" + tmpAgent, timeout); // with
					if (m != null) {
						// System.out.println("OKJEANT:LKNAT:LANTE:LKTA\n\n\n");
						String payload = m.getPayload().toString();
						if (payload.indexOf("<?xml") != -1)
							payload = payload
									.substring(payload.indexOf(">") + 1);
						if (payload.indexOf("<RuleML") != -1)
							payload = payload
									.substring(payload.indexOf(">") + 1);
						if (payload.indexOf("</RuleML>") != -1)
							payload = payload.replaceFirst("</RuleML>", "");
						if (payload.indexOf("no_further_answers") != -1) {
							timeout = 500;
							continue;
						}
						try {
							payload = URLDecoder.decode(payload, "UTF-8");
						} catch (Exception e) {
						}
						answer = answer + payload + "\r\n\r\n";

						if (i > 0)
							i--;
					} else
						i++;
				} while (i < 2); // terminate if no further answers are received
				// wrap answer in XML RuleML document

				answer = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
						+ "<RuleML "
						+ "xmlns=\"http://www.ruleml.org/0.91/xsd\" "
						+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
						+ "xsi:schemaLocation=\"http://www.ruleml.org/0.91/xsd "
						+ "http://ibis.in.tum.de/research/ReactionRuleML/0.2/rr.xsd\">\r\n\r\n"
						+ answer + "</RuleML>";

				// unregister temp. UMO
				try {
					// service.getMuleContext().getRegistry().unregisterEndpoint(tmpAgent);
				} catch (Exception exx) {
					logger.error("Can not unregister synchronous UMO for "
							+ tmpAgent);
					logger.error(exx);
					return exx.toString();
				}

				// return answer
				return answer;
			}
		} else {

			// Asynchronous processing between agents
			// We are done, everything is asynchronous
			comm.addMsg(rMsg);
			context.setStopFurtherProcessing(true);
			return null;
		}

	}

	/**
	 * This method is called when the component is called as a web service
	 */
	public void receive(ProvaList rMsg) throws Exception {
		// Add the message as a goal to the asynchronous Prova Communicator
		// queue
		logger.info(rMsg);
		comm.addMsg(rMsg);
	}

	public Boolean test() throws Exception {
		return Boolean.TRUE;
	}

	public void setService(Service service) {
		// TODO Auto-generated method stub
		this.service = service;
	}

	public String getAgentName() {
		// TODO Auto-generated method stub
		return agentName;
	}

	public void send(String receiver, ProvaList provaList) throws Exception {
		// TODO Auto-generated method stub
		// translate Prova Message to Reaction RuleML message
		// provaList.setGround(true);
		try {
			Prova2RuleMLTranslator prova2rrml = new Prova2RuleMLTranslator();
			System.out.println("The ProvaList which is about to send:"
					+ provaList);
			Object translatedSend = prova2rrml.transform(provaList);
			// overwrites messages
			if (receiver.equals("httpEndpoint")) {
				synchronized (this) {
					wait(300);
				}
			}
			// interchange message
			MuleClient client = new DefaultLocalMuleClient(
					service.getMuleContext());
			System.out.println("Forward "+provaList+" To:" + receiver
					+ ", the sender is " + getAgentName() + ".");
			client.dispatch(receiver, translatedSend, null);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}