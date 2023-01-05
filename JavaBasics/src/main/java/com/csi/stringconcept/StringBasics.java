package com.csi.stringconcept;

import java.time.Year;

public class StringBasics {

	public static void main(String[] args) {

		/*
		 * String s1 = "CREDIT";
		 * 
		 * String s2 = new String("CREDIT");
		 * 
		 * System.out.println(s1 == s2); // Address is different so it give false value.
		 * 
		 * System.out.println(s1.equals(s2)); // equals it will check actual value.
		 * 
		 * System.out.println(s1.equalsIgnoreCase(s2));
		 * 
		 * System.out.println(s1.length());
		 * 
		 * System.out.println(s1.charAt(3)); // Always Array start from 0 location.
		 * 
		 * s1.concat(s2); // Immutable
		 * 
		 * System.out.println(s1);
		 * 
		 * System.out.println(s1.compareTo(s2));
		 * 
		 * System.out.println(s2.toLowerCase());
		 * 
		 * System.out.println(s1.contentEquals(s2));
		 * 
		 * System.out.println(s1.codePointBefore(5));
		 * 
		 * System.out.println(s1.endsWith(s2));
		 * 
		 * System.out.println(s1.lastIndexOf(1));
		 * 
		 * System.out.println(s1.subSequence(1, 4));
		 * 
		 * System.out.println(s1.matches(s2));
		 * 
		 * System.out.println(s1.contains(s2));
		 * 
		 * System.out.println(s1.hashCode());
		 * 
		 * System.out.println(s1.join(s2, s2));
		 */
		

		// StringBuffer

		
		  StringBuffer buffer1 = new StringBuffer("CSI NIGDI");
		  
		  StringBuffer buffer2 = new StringBuffer("PUNE");
		  
		  buffer1.append(buffer2);
		  
		  System.out.println(buffer1);
		  
		  System.out.println(buffer1.reverse());
		  
		  System.out.println(buffer1.charAt(5));
		 

		// StringBuilder

		/*
		 * StringBuilder builder1 = new StringBuilder("PRASHANT");
		 * 
		 * StringBuilder builder2 = new StringBuilder("PATLE");
		 * 
		 * builder1.append(builder2);
		 * 
		 * System.out.println(builder1);
		 * 
		 * System.out.println(builder1.reverse());
		 * 
		 * System.out.println(builder1.charAt(12));
		 */
		
		
		String companyName = " ";
		
		if(companyName.isEmpty()) 
		{
			System.out.println("null");
		}
		else {
			System.out.println(companyName);
		}

	}

}
