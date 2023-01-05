package com.csi.protectedjava;

import com.csi.core.Customer;

public class ProtectedBase extends Customer {


	public static void main(String[] args) {
		ProtectedBase protectedBase = new ProtectedBase();
		
		System.out.println("\n Customer Id :" + protectedBase.custId + "\n Customer Name :" + protectedBase.custName);
	}
}
