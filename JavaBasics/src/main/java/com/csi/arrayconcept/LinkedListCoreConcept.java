package com.csi.arrayconcept;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCoreConcept {

	public static void main(String[] args) {
		
		List<String> branchNameList = new LinkedList<String>();
		
		branchNameList.add("Civil");
		branchNameList.add("Mechanical");
		branchNameList.add("Electrical");
		branchNameList.add("Computer");
		branchNameList.add("IT");
		branchNameList.add("Chemical");
		branchNameList.add("Electronics");
		
		branchNameList.forEach(System.out::println);
		
	}
  
}
