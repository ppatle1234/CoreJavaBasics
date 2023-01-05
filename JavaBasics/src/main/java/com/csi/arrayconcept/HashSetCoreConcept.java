package com.csi.arrayconcept;

import java.util.HashSet;
import java.util.Set;

public class HashSetCoreConcept {
	
	public static void main(String[] args) {
		
		Set<String> branchNameList = new HashSet<String>();
		
		branchNameList.add("Civil");
		branchNameList.add("Mechanical");
		branchNameList.add("Civil");
		branchNameList.add("Mechanical");
		branchNameList.add("Electronics");
		branchNameList.add("Chemical");
		branchNameList.add("Mechanical");
		branchNameList.add("IT");
		
		branchNameList.forEach(System.out::println);
	}
	

}
