package com.csi.jdk18features;

interface Customers
{
	void get();
}

public class MethodRefferenceConcept {

	public static void set() {
		
		System.out.println("\n Mr. Prashant Patle Sr. Java Developer");
		
	}
	
	public static void main(String[] args) {
		
		Customers cc = MethodRefferenceConcept :: set;
		
		cc.get();
	}
	
}
