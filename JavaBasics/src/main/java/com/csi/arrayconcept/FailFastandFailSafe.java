package com.csi.arrayconcept;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FailFastandFailSafe {

	public static void main(String[] args) {

		List<String> companyList = new ArrayList<String>();

		companyList.add("TCS");
		companyList.add("HCL");
		companyList.add("INFOSYS");

		/*
		 * for (String cName : companyList) { companyList.remove(2); // Fail Fast
		 * Exception System.out.println(cName); }
		 */

		for (String cName : companyList) {
			if (companyList.toString().equals("TCS"))
				; // Fail Safe Exception
			{
				companyList.add("DF");
			}

			System.out.println(cName);

		}

	}

	/*
	 * public static void main(String[] args) { List<String> companyList = new
	 * LinkedList<String>();
	 * 
	 * companyList.add("TCS"); companyList.add("INFOSYS"); companyList.add("WIPRO");
	 * 
	 * 
	 * for(String cName : companyList) { // companyList.remove(1);
	 * System.out.println(cName); }
	 * 
	 * 
	 * for(String cName : companyList) { if(companyList.toString().equals("TCS")); {
	 * companyList.add("Ds");
	 * 
	 * }
	 * 
	 * System.out.println(cName); } }
	 */

}
