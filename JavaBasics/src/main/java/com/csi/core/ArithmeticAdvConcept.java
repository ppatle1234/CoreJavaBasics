package com.csi.core;

public class ArithmeticAdvConcept {

	public static void main(String[] args) {
		
		ArithmeticAdvConcept arithmeticAdvConcept = new ArithmeticAdvConcept();
		
		arithmeticAdvConcept.add(20, 10);
		System.out.println("\n Subtraction Result :" + sub(20, 10));
		System.out.println("\n Multiplication Result :" + arithmeticAdvConcept.mul(20, 10));
		System.out.println("\n Division Result :" + arithmeticAdvConcept.div(30, 10));
	}
	
	void add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("\n Addition Result :" + result);
	}
	
	static int sub(int n1, int n2) {
		return n1 - n2;
	}
	
	double mul(int n1, int n2) {
		return n1 * n2;
	}
	
	float div(int n1 , int n2) {
		return n1 / n2;
	}
	
	
}
