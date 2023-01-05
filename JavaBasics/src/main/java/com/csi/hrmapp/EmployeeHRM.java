package com.csi.hrmapp;

public class EmployeeHRM {

	public static void main(String[] args) {

		System.out.println("\n Employee ID : " + Constants.EMPLOYEE_ID + "\n Employee Name : " + Constants.EMPLOYEE_NAME
				+ "\n Company Name :" + Constants.COMPANY_NAME);
		
		if(Constants.COMPANY_NAME.equals("INFOSYS"))
		{
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
