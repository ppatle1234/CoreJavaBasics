package com.csi.arrayconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Customer
{
	private int custId;
	private String custName;
	private int custAge;
	
	public Customer(int custId, String custName, int custAge) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
	}

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

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + "]";
	}
	
	
	
}

class AgeComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if (c1.getCustAge() == c2.getCustAge()) {
			return 0;
		} else if (c1.getCustAge() > c2.getCustAge()) {
			return 1;
		} else {
			return -1;
		}
	}

	
	
}

class NameComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		
		return c1.getCustName().compareTo(c2.getCustName());
	}

	
	
}

public class ComparatorConcept {

	public static void main(String[] args) {
		
		List<Customer> custList = new ArrayList<Customer>();
		
		custList.add(new Customer(101, "Rahul Malodia", 20));
		custList.add(new Customer(102, "Anil Chetri", 18));
		custList.add(new Customer(103, "Rocky Gurbani", 30));
		custList.add(new Customer(104, "Mehul Desai", 31));
		custList.add(new Customer(105, "Sarang Kewate", 28));
		custList.add(new Customer(106, "Kiran Jadhav", 22));
		custList.add(new Customer(107, "Raja Shekhar", 25));
		
	//	System.out.println(custList);
		
	/*
	 * for(Customer c : custList) { System.out.println(c); }
	 */
		
	//	custList.forEach(c -> System.out.println(c));
		
	//	custList.forEach(System.out::println);
		
		System.out.println("\n Name of the Customer :");
		Collections.sort(custList, new NameComparator());
		custList.forEach(System.out::println);
		
		
		System.out.println("\n Age of the Customer :");
		Collections.sort(custList, new AgeComparator());
		custList.forEach(System.out::println);
		
		
	}
}
