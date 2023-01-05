package com.csi.jdk18features;

import java.util.Optional;

public class OptionalCoreConcept {
	
	public static void main(String[] args) {
		
		String companyName = "Prashant";
	
		
	//	System.out.println(companyName.length());
		
		Optional<String> cName = Optional.ofNullable(companyName);
		
		if (cName.isPresent())
		{
			System.out.println(companyName.length());
		}
		else
		{
            System.out.println("Not Present");
		}
		
		
		
		
		/*
		 * 
		 * String companyName = "pssssssssss";
		 * 
		 * //System.out.println(companyName.length());
		 * 
		 * Optional<String> cName = Optional.ofNullable(companyName);
		 * 
		 * if(cName.isPresent()) {
		 * 
		 * System.out.println(companyName.length());
		 * 
		 * } else { System.out.println("Company name as null"); }
		 * 
		 * 
		 */
	}

}
