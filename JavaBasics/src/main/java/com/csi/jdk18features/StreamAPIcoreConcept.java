package com.csi.jdk18features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	private int empId;
	private String empName;
	private double empSalary;
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}

public class StreamAPIcoreConcept {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(101, "Prashant", 2100.21));
		empList.add(new Employee(102, "Rishi", 6500.90));
		empList.add(new Employee(103, "Shubham", 3400));
		
	//	System.out.println(empList);
		
	/*
	 * for(Employee employee : empList) { if(employee.getEmpSalary() < 5000) {
	 * System.out.println(employee); } }
	 */
		
	//	empList.stream().filter(emp -> emp.getEmpSalary() < 5000).forEach(e -> System.out.println(e));
		
	//	empList.stream().filter(emp -> emp.getEmpSalary() > 5000).forEach(System.out::println);
		
	//	System.out.println(empList.size());
		
		/************************ Collectors ***********************/
		
		long count = empList.stream().collect(Collectors.counting());
		
		System.out.println(count);
	}

}
