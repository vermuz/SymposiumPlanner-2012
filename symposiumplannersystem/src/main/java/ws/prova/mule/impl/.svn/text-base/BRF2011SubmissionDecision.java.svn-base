package ws.prova.mule.impl;

import java.util.List;

import ws.prova.kernel2.ProvaConstant;
import ws.prova.reference2.ProvaConstantImpl;

public class BRF2011SubmissionDecision {

	public static ProvaConstant appropriate = null;

	public static String[] brflocations = { "BRF", "USA", "US", "America",
			"BRF 2011", "BRF2011" };

	public static String[] brfSubmissionCategory = { "Demo paper", "Full paper" };

	private static double brfevent = 0;

	public static double decision(Object country, Object submissionCategory,
			Object keywords, Object playLoad) {

		appropriate = ProvaConstantImpl.create("impossible");

		brfevent = 0;

		computeLocation(country.toString());
		computeSubmissionCategory(submissionCategory.toString());
		computeKeyWords(keywords.toString(), playLoad);

		if (brfevent != 0)
			appropriate = ProvaConstantImpl.create("possible");

		return brfevent;

	}

	private static void computeKeyWords(String keywords, Object playLoad) {
		// TODO Auto-generated method stub
		List answerMessageList = ((List) playLoad);
		String[] keys = keywords.toString().split(";");
		for (int i = 0; i < answerMessageList.size() - 1; i++) {
			String temp = answerMessageList.get(i).toString().toLowerCase();
			for (int j = 0; j < keys.length; j++) {
				String key = keys[j].trim().toLowerCase();
				if (temp.contains(key)) {
					brfevent += 1.5;
				}
			}
		}

	}

	private static void computeSubmissionCategory(String submissionCategory) {
		// TODO Auto-generated method stub
		if (findInArray(submissionCategory, brfSubmissionCategory))
			brfevent += 1;

	}

	private static void computeLocation(String country) {
		// TODO Auto-generated method stub
		if (findInArray(country, brflocations))
			brfevent += 1;
	}

	private static boolean findInArray(String key, String[] arrays) {
		for (int m = 0; m < arrays.length; m++) {
			if (key.equalsIgnoreCase(arrays[m]))
				return true;
		}
		return false;
	}

	public static ProvaConstant isPermit() {
		return appropriate;
	}

}