package com.csi.core;

/*final class Customer {
	
}

class Product extends Customer  // final class can extends.
{
	
}*/

/*class Customer 
{
	final void get()
	{
		
	}
	void get(String custName)
	{
		
	}

}

class Product extends Customer    // Method cant Override
{
	void get()
	{
		
	}
}*/

public class FinalCoreConcept {

	final int empId = 11;
	public static void main(String[] args) {
		
		FinalCoreConcept finalCoreConcept = new FinalCoreConcept();
		
		finalCoreConcept.showData();
	}
	
	void showData()
	{
		//empId = 22;  // Cant Reinitialize because we declare as final
		
		System.out.println("\n Employee Id :" + empId);
	}
}

