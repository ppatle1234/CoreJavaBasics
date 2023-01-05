package com.csi.arrayconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class ArrayListCoreConcept {
	
	public static void main(String[] args) {
		
	List<String> branchNameList = new ArrayList<String>();
	
	     branchNameList.add("Civil");
	     branchNameList.add("Mechanical");
	     branchNameList.add("Electrical");
	     branchNameList.add("Chemical");
	     branchNameList.add("Electronics");
	     branchNameList.add("IT");
	     branchNameList.add("Computer");
	     
			/*
			 * branchNameList.remove(2);
			 * 
			 * System.out.println(branchNameList);
			 */
	     
			/*
			 * Iterator<String> itrIterator = branchNameList.iterator();
			 * 
			 * while (itrIterator.hasNext()) { System.out.println(itrIterator.next()); }
			 */
			
	
			/*
			 * for(String bName : branchNameList) { System.out.println(bName); }
			 */
	 
			/*
			 * branchNameList.forEach(bName -> System.out.println(bName));
			 */	 
	     
			/* branchNameList.forEach(System.out::println); */
		
	/*
	 * Iterator<String> iterator = branchNameList.iterator();
	 *
	 * while(iterator.hasNext()) { System.out.println(iterator.next()); }
	 */
		
	/*
	 * for(String bName : branchNameList) { System.out.println(bName); }
	 */
		
		
	/*
	 * branchNameList.forEach(bName -> System.out.println(bName));
	 */
		
	/*
	 * branchNameList.forEach(System.out::println);
	 */
		
		
		//  Assements for compare object with String take input from end user by using scanner
		//  add if condition and check if branch is available then say Yes else No
		 
	
	   boolean flag;
	   System.out.println("\n Please Enter the Name of the Branch to Check Availability :");
	   
	   do {
	
	   Scanner scanner = new Scanner(System.in);
	   
	   String bName = scanner.nextLine();
	   
	   if(branchNameList.contains(bName))
	   {
		   System.out.println("Yes");
		   flag = false;
	   } else {
		   System.out.println("No");
		   flag = true;
 	   }
	   }while(flag);
		 
	}

}
