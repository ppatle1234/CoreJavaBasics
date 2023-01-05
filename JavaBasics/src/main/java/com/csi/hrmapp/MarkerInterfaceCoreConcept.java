package com.csi.hrmapp;

class Customer
{
	int custId;
    transient String custName;         // cant serialize
}

public class MarkerInterfaceCoreConcept {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
	}

}
