package com.csi.hrmapp;

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

public class FinalConcept {

	final int empId = 121;
	public static void main(String[] args) {
		
		FinalConcept finalConcept = new FinalConcept();
		
		finalConcept.showData();
	}
	
	void showData()
	{
	  //	empId = 122;  // Cant Reinitialize because we declare as final
		
		System.out.println("\n Employee Id :" + empId);
	}
}
