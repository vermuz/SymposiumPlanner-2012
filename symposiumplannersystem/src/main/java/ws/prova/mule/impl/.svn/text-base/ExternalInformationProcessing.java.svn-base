package ws.prova.mule.impl;

import java.util.ArrayList;
import java.util.List;

import ws.prova.reference2.ProvaListImpl;

public class ExternalInformationProcessing {

	public static ArrayList process(List rawResources) {
		ArrayList affilication = new ArrayList();
		ArrayList roles = new ArrayList();
		ArrayList newResources = new ArrayList();
		ArrayList resources = new ArrayList();
		newResources.add("externalInformation");
		for (int i = 0; i < rawResources.size(); i++) {
			String temp = rawResources.get(i).toString();
			String[] strs = temp.substring(1, temp.length() - 1).split(",");
			if (i == 0) {
				if (!strs[0].trim().equals("")) {
					roles.add("role");
					roles.add(strs[0].toLowerCase());
					newResources.add(roles);
				}
				if (!strs[1].trim().equals("")) {
					affilication.add("affilication");
					affilication.add(strs[1].toLowerCase());
					newResources.add(affilication);
				}
				if (!strs[2].trim().equals("")) {
					resources = new ArrayList();
					resources.add("resource");
					resources.add(strs[2]);
					newResources.add(resources);
				}
			} else {
				if (!strs[2].trim().equals("")) {
					resources = new ArrayList();
					resources.add("resource");
					resources.add(strs[2]);
				}
			}
		}
		
//		ProvaListImpl.create(newResources);
		return newResources;
	}


}
