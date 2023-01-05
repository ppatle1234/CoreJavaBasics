package com.csi.constructorconcepttwo;

class Company 
{
	private int cId = 101;
	private String cName = "Patle Group";
	private boolean cStatus = true;
	String cAddress;
	
	public Company() {
		// TODO Auto-generated constructor stub
		
		System.out.println("\n Company ID :"+ cId +"\n Company Name :"+ cName +"\n Company Status :"+ cStatus);
	}
	
	public Company(String cAddress) {
		// TODO Auto-generated constructor stub
		this.cAddress = cAddress;
	
	}
	
	public void show()
	{
		System.out.println("\n Company Address : " + cAddress);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		
		Company company = new Company();
		
		Company company2 = new Company("PUNE");
		
		company2.show();
		
	}
}
