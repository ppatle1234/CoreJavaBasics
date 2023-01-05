package com.csi.abstractconcept;

interface Department
{
	void get(int deptId, String deptName);
	
	static void set() {
		System.out.println("I am from Static");
	}
	
	default void net() {
		System.out.println("I am from Default");
	}
	
	int add(int n1, int n2);
	int sub(int n1, int n2);
	int mul(int n1, int n2);
	int div(int n1, int n2);
}

interface Employee
{
	void showEmployeeData(int empId, String empName, double empSalary, String empAddress);
}

abstract class Product
{
	abstract void productData(int productId, String productName, double productPrice );
}

class Company extends Product implements Department, Employee
{

	@Override
	void productData(int productId, String productName, double productPrice) {
		// TODO Auto-generated method stub
		System.out.println("\n Product ID :"+productId+"\n Product Name :"+productName+"\n Product Price :"+ productPrice);
		
	}

	@Override
	public void showEmployeeData(int empId, String empName, double empSalary, String empAddress) {
		// TODO Auto-generated method stub
		System.out.println("\n Employee ID :"+empId+"\n Employee Name :"+empName+"\n Employee Salary :"+ empSalary + "\n Employee Address :" + empAddress);
	}

	@Override
	public void get(int deptId, String deptName) {
		// TODO Auto-generated method stub
		System.out.println("\n Department ID :"+ deptId +"\n Department Name :"+ deptName);
	}

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	@Override
	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	@Override
	public int mul(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

	@Override
	public int div(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 / n2;
	}


	
}
public class InterfaceAndAbstract {
	public static void main(String[] args) {
		
		Company company = new Company();
		
		Department.set();
		company.net();
		company.get(101, "FINANCE");
		company.productData(121, "JIO Phone", 1990.30);
		company.showEmployeeData(154, "Anish Sharma", 234442.30, "Mumbai");
		
		System.out.println("================================================");
		
		System.out.println("\n Addition Result :" + company.add(50, 20));
		System.out.println("\n Subtraction Result :" + company.sub(50, 20));
		System.out.println("\n Multiplication Result :" + company.mul(50, 20));
		System.out.println("\n Division Result :" + company.div(50, 10));
		
	}

}
