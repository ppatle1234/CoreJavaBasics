package com.csi.arrayconcept;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCoreConcept {

	public static void main(String[] args) {
		
		Set<String> branchNameList = new TreeSet<String>();
		
		branchNameList.add("Mechanical");
		branchNameList.add("Chemical");
		branchNameList.add("IT");
		branchNameList.add("341");
		branchNameList.add("0199");
		branchNameList.add("9100");
		branchNameList.add("Civil");
		branchNameList.add("Electrical");
		branchNameList.add("IT");
		branchNameList.add("Chemical");
		branchNameList.add("Mechanical");
		branchNameList.add("Electronics");
		
		branchNameList.forEach(System.out::println);
	}
}
