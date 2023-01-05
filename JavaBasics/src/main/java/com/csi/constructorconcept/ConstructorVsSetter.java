package com.csi.constructorconcept;

class Customer {
	
	private int custId;
	
	private String custName;
	
	private String custAddress;
	
	private long custContactNumber;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public long getCustContactNumber() {
		return custContactNumber;
	}

	public void setCustContactNumber(long custContactNumber) {
		this.custContactNumber = custContactNumber;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int custId, String custName, String custAddress, long custContactNumber) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custContactNumber = custContactNumber;
	}	
	
}

public class ConstructorVsSetter {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		customer.setCustId(101);
		customer.setCustName("Prashant");
		customer.setCustContactNumber(7768939753L);
		
		System.out.println("\n Customer ID :"+ customer.getCustId() +"\n Customer Name :"+ customer.getCustName() +"\n Customer Contact Number :"+ customer.getCustContactNumber());

		
		
		
		  System.out.println("Constructor O/P");
		  
		  Customer customer2 = new Customer(1234, "Prashant", "Nagpur", 67664L );
		  System.out.println("\n Customer ID :"+ customer2.getCustId() +
		  "\n Customer Name :"+ customer2.getCustName() + "\n Customer Address :" +
		  customer2.getCustAddress() + "\n Customer Contact Number :" +
		  customer2.getCustContactNumber());
		  
		 
		
	}
	
}
