/**
 * 
 */
package ws.prova.mule.impl;

import java.util.ArrayList;
import java.util.List;

import ws.prova.kernel2.ProvaList;

/**
 * @author Administrator
 * 
 */
public class DecisionCriteria {

	private static List list = null;
	private static boolean tag = false;

	
	public static List subOADecision(List agent, Object function, ProvaList arguments) {
		
		List candidateList = new ArrayList();
		list = new ArrayList();
		String argumentsString = arguments.toString();
		for (int i = 0; i < agent.size(); i++) {
			String candidateAgent = ((List)agent.get(i)).get(2).toString();
			int pos = candidateAgent.indexOf("_");
			((List)agent.get(i)).set(2, candidateAgent.substring(pos+1));
			candidateList.add(((List)agent.get(i)).get(2));
			String ns = candidateAgent.substring(0, pos);
			if(argumentsString.indexOf(ns)!=-1)
				list.add(((List)agent.get(i)).get(2));
		}

		if(function.toString().equalsIgnoreCase("submission")){
			list = candidateList;
			tag = false;
			return list;
		}
		//======================================================================================
		//RuleML-2012
		if(argumentsString.indexOf("ECAI")!=-1||argumentsString.indexOf("Europe")!=-1||argumentsString.indexOf("France")!=-1||argumentsString.indexOf("Montpellier")!=-1){
			for (int i = 0; i < list.size(); i++) {
				if(((List)list.get(i)).get(2).toString().equalsIgnoreCase("RuleML-2012-ECAI")){
					tag=true;
					break;
				}
			}
			
			if(!tag){
				list.add("RuleML-2012-ECAI");
			}
		}
		//=======================================================================================
		
		if(argumentsString.indexOf("STRUCT")!=-1||argumentsString.indexOf("Canada")!=-1||argumentsString.indexOf("Fredericton")!=-1||argumentsString.indexOf("Fredericton")!=-1){
			for (int i = 0; i < list.size(); i++) {
				if(((List)list.get(i)).get(2).toString().equalsIgnoreCase("RuleML-2012-STRUCT")){
					tag=true;
					break;
				}
			}
			
			if(!tag){
				list.add("RuleML-2012-STRUCT");
			}
		}
		if(list.size()==0)
			list = candidateList;
		tag=false;
		return list;
		
		
	}
}
