package com.csi.core;

public class ArithmeticApplication {

	public static void main(String[] args) {
		
		int n1 = 30, n2 = 20, n3 = 50, n4 = 10, n5 = 80, result;
		
		result = n1 + n2 ;
		System.out.println("\n Addition Result 1 :" + result);
		
		result = n3 + n4 + n5;
		System.out.println("\n Addition Result 2 :" + result);
		
		result = n1 + n2 + n3 + n4 + n5;
		System.out.println("\n Addition Result Total :" + result);
		
		result = n1 - n2 ;
		System.out.println("\n Subtraction Result 1 :" + result);
		
		result = n3 - n4;
		System.out.println("\n Subtraction Result 2 :" + result);
		
		result = n1 - n2 - n3 - n4 - n5;
		System.out.println("\n Subtraction Result Total :" + result);
		
		result = n1 * n2;
		System.out.println("\n Multiplication Result 1 :" + result);
		
		result = n3 * n4; 
		System.out.println("\n Multiplication Result 2 :" + result);
		
		result = n1 * n2 * n3 * n4 * n5;
		System.out.println("\n Multiplication Result Total :" + result);
		
		result = n1 /n2;
		System.out.println("\n Division Result 1 :" + result);
		
		result = n3/n4;
		System.out.println("\n Division Result 2 :" + result);
		
		result = n1/n2 + n2/n3 + n4/n5 ;
		System.out.println("\n Division Result Total :" + result);
	}
}