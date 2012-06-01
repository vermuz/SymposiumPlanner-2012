package ws.prova.mule.impl;


import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;

import ws.prova.plugin.registry.ProvaPluginRegistry;
import ws.prova.plugin.registry.impl.ProvaPluginRegistryImpl;
import de.fub.csw.sparql.ProvaSparqlSelectPlugin;

/**
* <code>ESBManager</code> Main Class to start the Enterprise Service Bus
* 
* @author <a href="mailto:adrian.paschke@gmx.de">Adrian Paschke</a>
* @version 
*/

public class ESBManager {
	
    // default config file
	public static String config = "mule-all-config.xml";
	public static MuleContext context = null;
	
	public static void setUp(String config) {
		ProvaPluginRegistry ppr = new ProvaPluginRegistryImpl();
		ppr.registerPlugin(new ProvaSparqlSelectPlugin());
		
		System.out.println("User.Dir:"+System.getProperty("user.dir"));
		try {
			context = new DefaultMuleContextFactory().createMuleContext
			(new SpringXmlConfigurationBuilder(config));
			context.start();
		} catch (InitialisationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void tearDown() {
		try {
			context.stop();
		} catch (MuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: ESBManager <start|stop>  <config xml file>");
			return;
		} else if (args.length >1) {
			config = args[1];
		} 
		
		if (args[0].equals("start")) {
			setUp(config);
			return;
		} else
		if (args[0].equals("stop")) {
			tearDown();
			return;
		} else {
			System.out.println("Usage: ESBManager <start|stop>  <config xml file>");
			return;
		}
//		setUp();
	}
	
}
