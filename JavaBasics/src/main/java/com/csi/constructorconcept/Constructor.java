package com.csi.constructorconcept;

class Company 
{
	private int cId = 101;
	private String cName = "Patle Group";
	private boolean cStatus = true;
	
	public Company() {
		// TODO Auto-generated constructor stub
		
		System.out.println("\n Company ID :"+ cId +"\n Company Name :"+ cName +"\n Company Status :"+ cStatus);
	}
	
	public Company(String cAddress) {
		// TODO Auto-generated constructor stub
		
		System.out.println("\n Company Status :"+ cAddress);
	}
	
	
}

class Employee extends Company
{
	public Employee() {
		
		super("Mumbai");
		// TODO Auto-generated constructor stub
	}
	
	void show()
	{
		System.out.println("I am from show");
	}
}

public class Constructor {

	public static void main(String[] args) {
		

	 Company company = new Company();
		
	 Employee employee = new Employee();
	 employee.show();
	}
}
