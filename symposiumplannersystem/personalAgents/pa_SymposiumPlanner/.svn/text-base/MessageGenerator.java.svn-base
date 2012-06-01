package pa_SymposiumPlanner;

/**
 * MessageGenerator.java
 *
 * This class will create messages to be sent back to the Prova engine.
 *
 * Created on May 1, 2007, 2:57 PM
 */
 
import java.io.*;
import java.util.*;

import jdrew.oo.util.*;

import nu.xom.*;

public class MessageGenerator{
	//Data contains the bindings from the query
	private Vector data;
	//Size is the number of variables in the query
	private int size;
	//Id, protocol, sender, and relation name are the parameters of the message that was sent
	private String id;
 	private String prot;
 	private String sender;
	private String relationName;
	private String[] variableOrder;
	/**
	 * MessageGenerator Contructor
	 *
	 * @param Vector input - the bindings of the query
	 * @param int varSize - the number of variables in the query
	 * @param String senderIn - the sender of the message
	 * @param String idIn - the id of the message
	 * @param String protocolIn - the protocol of the message
	 * @param String rel - the relation of the query
	 */
	public MessageGenerator(Vector input, int varSize, String senderIn, String idIn, String protocolIn, String rel,String[] varOrder){
		size = varSize;
		data = input;
		id = idIn;	
		prot = protocolIn;
		sender = senderIn;
		relationName = rel;
		variableOrder = varOrder;
	}
	
	public MessageGenerator(Vector input, int varSize, String senderIn, String idIn, String protocolIn, String rel){
		size = varSize;
		data = input;
		id = idIn;	
		prot = protocolIn;
		sender = senderIn;
		relationName = rel;
	}

 /**
  * This method will generate the messages to be sent to the prova engine
  *
  * @return String[] - the messages to be sent back to the prova engine (could be multiple)
  */

	public String[] Messages(String query){
String[] messages = new String[data.size()];
		
		Iterator it = data.iterator();
		
		Object[][] vars;
		int j = 0;
		
		//TODO: WORKAROUND. Gathers the original order of Ind's and Var's (similar to variable order, but 
		//in this case, preserves Ind's. This allows the original Ind's to be sent back with the query,
		//eliminating the need for substitutions.
		Vector<String[]> vectorElements = new Vector<String[]>();
		//Break string up
		StringTokenizer st = new StringTokenizer(query,"<");
		String tempString = ""; //Temporary storage
		//While information remains
		boolean pastRel=false;
		while(st.hasMoreTokens()) {
			tempString = st.nextToken();

			//If it is a non-typed variable
			if(tempString.startsWith("Var")&&pastRel) {
				vectorElements.add(new String[]{"Var",("<" + tempString + "</Var>")});
			}
			//TODO: If it is a typed variable
			else if(tempString.startsWith("Ind")&&pastRel) {
				vectorElements.add(new String[]{"Ind",("<" + tempString + "</Ind>")});
			}
			else if(tempString.startsWith("Rel")) {
				pastRel=true;
			}
		}
		//End workaround
		
		while(it.hasNext()){
			
			
			
			Element root = new Element("RuleML");
			
		    root.setNamespaceURI("http://www.ruleml.org/0.91/xsd");
			root.addNamespaceDeclaration("xsi","http://www.w3.org/2001/XMLSchema-instance");
			
			Attribute a3 = new Attribute("xsi:SchemaLocation", 
										 "http://www.w3.org/2001/XMLSchema-instance","http://www.ruleml.org/0.91/xsd http://ibis.in.tum.de/research/ReactionRuleML/0.2/rr.xsd");
			
			root.addAttribute(a3);
												
			Document doc = new Document(root);
								
		    Element message = new Element("Message");
			
			Attribute a1 = new Attribute("mode", "outbound");
			Attribute a2 = new Attribute("directive", "answer");				
			
			message.addAttribute(a1);
			message.addAttribute(a2);
			
			root.appendChild(message);
			
			Element oid = new Element("oid");
        	message.appendChild(oid);
			
			Element ind = new Element("Ind");
			oid.appendChild(ind);
			
			ind.insertChild(id,0);
			
			Element protocol = new Element("protocol");
			message.appendChild(protocol);
			
			Element ind2 = new Element("Ind");
			protocol.appendChild(ind2);
			
			ind2.insertChild(prot,0);
			
			Element send = new Element("sender");
			message.appendChild(send);
			
			Element ind3 = new Element("Ind");
			send.appendChild(ind3);
			
			ind3.insertChild(sender,0);
			
			
			Element content = new Element("content");
			message.appendChild(content);
			
			Element atom = new Element("Atom");
			content.appendChild(atom);
			
			Element rel = new Element("Rel");
			atom.appendChild(rel);
			rel.insertChild(relationName,0);
			
			vars = (Object[][])it.next();
			
			String[] rev = new String[size];
			
			//check for type here
			//send back types
			//because my types come back as String:Type, i need to make the type distinction here
			//as well as the returns of plexs and CTerms
			
			//test([item1,item2,item3]).

			//test(cterm[item1,item2,item3]).

			//test(12:Real).
			
			//TODO: Top-level workaround for OOjDREW's problem with returning variable bindings 
			//which aren't in order. This will rearrange them on a per message basis.
			Object[][] temp = new Object[size][2];//Temporary storage for re-arranged bindings
			//Re-arranges bindings to proper order defined by variableOrder (taken from base query)
			for(int a=0;a<size;a++) {
				temp[a][0] = variableOrder[a];
				for(int b=0;b<variableOrder.length;b++) {
					if(vars[b][0].toString().contains(variableOrder[a])) {
						temp[a][1] = vars[b][1];
						break;
					}
				}
			}
			vars = temp; //Assigns new binding order
			//End workaround
			for(int i = 0; i < size; i++){
				Object k   = vars[i][0];
				Object val = vars[i][1];	
				String temp2 = val.toString();
				//TODO: DYNAMIC WORKAROUND. The produced variable name is replaced by the original variable name.
				if(temp2.contains("</Var>")) {
					String tempVar = temp2.substring(temp2.indexOf(">")+1,temp2.lastIndexOf("<"));
					temp2 = temp2.replace(tempVar, k.toString());
				}
				rev[i] = temp2;
				//test
				//Element e = new Element("Ind");
			    //e.insertChild(val.toString(),0);
				//atom.appendChild(e);
			}
		
			//for(int i = size-1; i >= 0; i--){
			//i will already have the element here
			//so i need a way to parse the xml here and return an element to append
			//I think its possible to do with the RuleML parser
					
			//Look at the Message parser to loop through 
			int variableState = 0;
			for(int i = 0; i < vectorElements.size(); i++){
				
				Builder bl = new Builder();
				StringReader sr = null;
				if(vectorElements.elementAt(i)[0].equals("Ind")) {
					sr = new StringReader(vectorElements.elementAt(i)[1]);
				}
				else if(vectorElements.elementAt(i)[0].equals("Var")) {
					sr = new StringReader(rev[variableState]);
					variableState++;
				}
				Element newDocRoot = null;
				
				try{

					//System.out.println("Building Doc -->	");
					//System.out.println(rev[i]);
					Document doc2 = bl.build(sr);
					//System.out.println(doc2.toXML());
					
					Element docRoot = doc2.getRootElement();
					//loop through them
					newDocRoot = new Element(docRoot);
	
				}
				catch(Exception e){
					System.out.println(e.toString());
					
				}
					
				//System.out.println("NEW DOC ROOT: " + newDocRoot.getChild(0).toString());
				//Element e = new Element("Ind");
				//e.insertChild(rev[i],0);
				atom.appendChild(newDocRoot);
				
			}
			
			String d = doc.toXML();
			
			//System.out.println("Debug");
			//System.out.println(d.toString());
			//System.out.println("//Debug");
			
			
			String p1 = d.substring(0,241);
			String p2 = d.substring(251);
			
			d = p1 + " " + p2;
			
			messages[j] = d;
			j++;
		}
		
		return messages;
	}

	public String[] Messages2(){
		
		String[] messages = new String[data.size()];
		
		Iterator it = data.iterator();
		
		Object[][] vars;
		
		int j = 0;
		
		while(it.hasNext()){
			
			
			String messageTest = "";
			
			messageTest = "<RuleML xmlns=\"http://www.ruleml.org/0.91/xsd\"" + "\n" +
					"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + "\n" +
					"xsi:SchemaLocation=\"http://www.ruleml.org/0.91/xsd " + "\n" +
					"http://ibis.in.tum.de/research/ReactionRuleML/0.2/rr.xsd\">";
			
			messageTest = messageTest + "\n" + "\n" +
			"<Message mode=\"outbound\" directive=\"answer\">";
			

			messageTest = messageTest + "\n" +
			"\t <oid>" + "\n" +
			"\t\t <Ind>" + id + "</Ind>" + "\n" +
			"\t </oid>";
			
			messageTest = messageTest + "\n" +
			"\t<protocol>" + "\n" +
			"\t\t<Ind>" + "esb" + "</Ind>" + "\n" +
			"\t</protocol>";
			
			messageTest = messageTest + "\n" +
			"\t<sender>" + "\n" +
			"\t\t<Ind>" + sender + "</Ind>" + "\n" +
			"\t</sender>";
			
			messageTest = messageTest + "\n" +
			"\t<content>";
			
			messageTest = messageTest + "\n" +
			"\t\t<Rulebase>";
			
			vars = (Object[][])it.next();
			
			Object[][] temp = new Object[size][2];//Temporary storage for re-arranged bindings
			//Re-arranges bindings to proper order defined by variableOrder (taken from base query)
			for(int a=0;a<size;a++) {
				temp[a][0] = variableOrder[a];
				for(int b=0;b<variableOrder.length;b++) {
					if(vars[b][0].toString().contains(variableOrder[a])) {
						temp[a][1] = vars[b][1];
						break;
					}
				}
			}
			vars = temp; //Assigns new binding order	
			for(int i = 0; i < size; i++){
				Object val = vars[i][1];
				
				String var = variableOrder[i];
				
				messageTest = messageTest + "\n" + "\t \t \t<Equal>" + "\n";
				
				messageTest = messageTest + "\t\t\t\t <Var>";
				
				String variableName = var.substring(0,var.length());
				/*if(variableName.contains("N@@")) {
					variableName = variableName.substring(variableName.indexOf("_")+1,variableName.length());
				}*/
				messageTest = messageTest + variableName + "</Var>" + "\n";
				
				String binding = val.toString();
				
				StringTokenizer st = new StringTokenizer(binding,"\n");
				
				while(st.hasMoreTokens()){
					
					messageTest = messageTest + "\t\t\t" + "         " + st.nextToken() + "\n";
				}
				
				//messageTest = messageTest +  binding + "\n";
				
				messageTest = messageTest + "\t\t\t</Equal>";
				
			}
			
			messageTest = messageTest + "\n" +
			"\t\t</Rulebase>";				
			
			messageTest = messageTest + "\n" +
			"\t</content>";
			
			messageTest = messageTest + "\n" + "</Message>";
			
			messageTest = messageTest + "\n" + "</RuleML>";
		
			Builder bTest = new Builder();
			StringReader srTest = new StringReader(messageTest);
			//System.out.println(messageTest);
			
			try{

				//Document docTest = bTest.build(srTest);
				//messages[j] = docTest.toXML();
				messages[j] = messageTest;
			}catch(Exception e){
				System.out.println(e.toString());
				
			}	
			
			
			j++;
			
		}//while	
		
		
		
		return messages;
	}
	
	public String finalMessage(String query){
		
		String finalMessage = "";
		
		finalMessage = "<RuleML xmlns=\"http://www.ruleml.org/0.91/xsd\"" + "\n" +
				"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + "\n" +
				"xsi:SchemaLocation=\"http://www.ruleml.org/0.91/xsd " + "\n" +
				"http://ibis.in.tum.de/research/ReactionRuleML/0.2/rr.xsd\">";
		
		finalMessage = finalMessage + "\n" + "\n" +
		"<Message mode=\"outbound\" directive=\"no_further_answers\">";
		

		finalMessage = finalMessage + "\n" +
		"\t <oid>" + "\n" +
		"\t\t <Ind>" + id + "</Ind>" + "\n" +
		"\t </oid>";
		
		finalMessage = finalMessage + "\n" +
		"\t<protocol>" + "\n" +
		"\t\t<Ind>" + "esb" + "</Ind>" + "\n" +
		"\t</protocol>";
		
		finalMessage = finalMessage + "\n" +
		"\t<sender>" + "\n" +
		"\t\t<Ind>" + sender + "</Ind>" + "\n" +
		"\t</sender>";
		
		finalMessage = finalMessage + "\n" +
		"\t<content>";
		
		finalMessage = finalMessage + "\n" + "\t" + "<Atom>";
		
		finalMessage = finalMessage + "\n" + "\t" + "\t"+ "<Rel>end</Rel>";
		
		finalMessage = finalMessage + "\n" + "\t" + "\t" + "\t"+ "<Ind>messages</Ind>";
		
		finalMessage = finalMessage + "\n" + "\t" + "</Atom>";
		
		
		
		
		finalMessage = finalMessage + "\n" +
		"\t</content>";
		
		finalMessage = finalMessage + "\n" + "</Message>";
		
		finalMessage = finalMessage + "\n" + "</RuleML>";
		
		return finalMessage;
	}
	
	
	String[] TestMessages(){

		String[] messages = new String[data.size()];
		
		Iterator it = data.iterator();
		
		Object[][] vars;
		int j = 0;
		while(it.hasNext()){
			
			String mes;
			
			mes = "Message mode=outbound directive=answer \n"+
			"Oid: " + id + "\n" +
			"Protocol: " + prot + "\n"+
		    "Sender: " + sender + "\n"+
		    "Content: " +"\n" +
		    "Relation: " + relationName + "\n";
		    		
			vars = (Object[][])it.next();
			
			for(int i = 0; i < size; i++){
				
				Object k   = vars[i][0];
				Object val = vars[i][1];
				
				mes = mes + "Variable: " + k.toString() + " Binding: " + val.toString() + "\n";
				
				
			}
			    	    
			messages[j] = mes;
			j++;
			
		}
		
		return messages;
	}
	public String[] Messages3() {
		String[] messages = new String[data.size()];
		
		Iterator it = data.iterator();
		
		Object[][] vars;
		
		int j = 0;
		
		while(it.hasNext()){
			
			
			String messageTest = "";
			
			messageTest = "<RuleML xmlns=\"http://www.ruleml.org/0.91/xsd\"" + "\n" +
					"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + "\n" +
					"xsi:SchemaLocation=\"http://www.ruleml.org/0.91/xsd " + "\n" +
					"http://ibis.in.tum.de/research/ReactionRuleML/0.2/rr.xsd\">";
			
			messageTest = messageTest + "\n" + "\n" +
			"<Message mode=\"outbound\" directive=\"answer\">";
			

			messageTest = messageTest + "\n" +
			"\t <oid>" + "\n" +
			"\t\t <Ind>" + id + "</Ind>" + "\n" +
			"\t </oid>";
			
			messageTest = messageTest + "\n" +
			"\t<protocol>" + "\n" +
			"\t\t<Ind>" + "esb" + "</Ind>" + "\n" +
			"\t</protocol>";
			
			messageTest = messageTest + "\n" +
			"\t<sender>" + "\n" +
			"\t\t<Ind>" + sender + "</Ind>" + "\n" +
			"\t</sender>";
			
			messageTest = messageTest + "\n" +
			"\t<content>";
			
			messageTest = messageTest + "\n" +
			"\t\t<Atom>";
			vars = (Object[][])it.next();
			
			Object[][] temp = new Object[size][2];//Temporary storage for re-arranged bindings
			//Re-arranges bindings to proper order defined by variableOrder (taken from base query)
			for(int a=0;a<size;a++) {
				temp[a][0] = variableOrder[a];
				for(int b=0;b<variableOrder.length;b++) {
					if(vars[b][0].toString().contains(variableOrder[a])) {
						temp[a][1] = vars[b][1];
						break;
					}
				}
			}
			vars = temp; //Assigns new binding order	
			for(int i = 0; i < size; i++){
				boolean hasVaraibleAnswers = false;
				//TODO: WORKAROUND HERE. If there is a variable as an answer then we ignore it because otherwise
				//substitutions in Prova would not work. This has to be expected in PROVA.
				String tempMessage= "";
				Object val = vars[i][1];
				
				String var = variableOrder[i];
				
				tempMessage = tempMessage + "\n" + "\t \t \t<Equal>" + "\n";
				
				tempMessage = tempMessage + "\t\t\t\t <Var>";
				
				String variableName = var.substring(0,var.length());
				
				tempMessage = tempMessage + variableName + "</Var>" + "\n";
				
				String binding = val.toString();
				
				StringTokenizer st = new StringTokenizer(binding,"\n");
				
				while(st.hasMoreTokens()){
					String test = st.nextToken();
					if(test.contains("</Var>")) {
						hasVaraibleAnswers = true;
						String tempVar = test.substring(test.indexOf(">")+1,test.lastIndexOf("<"));
						test = test.replace(tempVar, variableName);
					}
					tempMessage = tempMessage + "\t\t\t" + "         " + test + "\n";
				}
				
				//messageTest = messageTest +  binding + "\n";
				
				tempMessage = tempMessage + "\t\t\t</Equal>"; 
				//if(!hasVaraibleAnswers)
					messageTest = messageTest + tempMessage;
			}
			
			messageTest = messageTest + "\n" +
			"\t\t</Atom>";				
			
			messageTest = messageTest + "\n" +
			"\t</content>";
			
			messageTest = messageTest + "\n" + "</Message>";
			
			messageTest = messageTest + "\n" + "</RuleML>";
			Builder bTest = new Builder();
			StringReader srTest = new StringReader(messageTest);
			//System.out.println(messageTest);
			
			try{

				//Document docTest = bTest.build(srTest);
				//messages[j] = docTest.toXML();
				messages[j] = messageTest;
			}catch(Exception e){
				System.out.println(e.toString());
				
			}	
			
			
			j++;
			
		}//while	
		
		
		
		return messages;
	}
	
	
	
	
	
	
}
