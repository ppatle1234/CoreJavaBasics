package com.csi.core;

public class VariablesInJava {
	
	int empId = 121;    // instance Variable
	
	static String empName = "Prashant";   // static Variable
	
	public static void main(String[] args) {
		
		VariablesInJava variablesInJava = new VariablesInJava();
		
		variablesInJava.showData();
		
		displayData();
	}

	void showData() 
	{
		long contactNumber = 23322L;    // local Variable
		
		System.out.println("\n Employee Id :" + empId + "\n Employee Name :"+ empName);
		System.out.println("\n Contact Number :" + contactNumber);
	}
	
	static void displayData() 
	{
		System.out.println("\n Employee Name :"+ empName);
	}
}
