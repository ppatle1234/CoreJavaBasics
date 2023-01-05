package com.csi.stringconcept;

import java.util.Iterator;
import java.util.Scanner;

public class DuplicateCharacterInString {

	public static void main(String[] args) {

		// Iterate character one by one

		String name = "PRASHANT";
		
		char []str = name.toCharArray();
		
		System.out.println(str);
		
		for(char c : str)
		{
			System.out.println(c);
		}
		 

		/******************************************************************************************/

		/*
		 * System.out.println("\n Please Enter the name to Print Duplicate Characters :"
		 * );
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * String name = scanner.nextLine();
		 * 
		 * String caseStr = name.toLowerCase();
		 * 
		 * char []str = caseStr.toCharArray();
		 * 
		 * int i,j;
		 * 
		 * for(i =0; i<name.length() ;i++) { for(j= i+1; j<name.length() ; j++) {
		 * if(str[i] == str[j]) { System.out.println(str[i]); } } }
		 * 
		 */
	
	}

}
