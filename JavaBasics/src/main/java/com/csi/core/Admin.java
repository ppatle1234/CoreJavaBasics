package com.csi.core;

public class Admin {

	private int admId = 21;
	private String admName = "Prashant Patle";
	private String admAddress = "Nagpur";
	private double admSalary = 2334323.23;
	private long admContactNumber = 3345543l;
	private String admDepartment = "Java Team Lead";
	
	public static void main(String[] args) {
		
		Admin admin = new Admin();	
		
		System.out.println("\n Admin ID : "+ admin.admId +"\n Admin Name :"+ admin.admName +"\n Admin Address :"
		+ admin.admAddress + "\n Admin Salary :" + admin.admSalary  +"\n Admin Contact Number :"
	    + admin.admContactNumber + "\n Admin Department :" + admin.admDepartment);
	}
}
