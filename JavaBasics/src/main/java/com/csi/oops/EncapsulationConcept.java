package com.csi.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employee
{
	private int empId;
	private String empName;
	private String empPost;
	private double empSalary;
	private long empContactNumber;
	private int empUId;
	private Date empDOB;
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
	public String getEmpPost() {
		return empPost;
	}
	public void setEmpPost(String empPost) {
		this.empPost = empPost;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public long getEmpContactNumber() {
		return empContactNumber;
	}
	public void setEmpContactNumber(long empContactNumber) {
		this.empContactNumber = empContactNumber;
	}
	public int getEmpUId() {
		return empUId;
	}
	public void setEmpUId(int empUId) {
		this.empUId = empUId;
	}
	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}
		
		
}
public class EncapsulationConcept {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setEmpId(121);
		employee.setEmpName("Rudra Singh");
		employee.setEmpPost("Sr. Java Developer");
		employee.setEmpSalary(34000.32);
		employee.setEmpContactNumber(9867432123l);
		employee.setEmpUId(342);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Date dob = null;
		
		try {
			dob = simpleDateFormat.parse("31-01-2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		employee.setEmpDOB(dob);
	
		System.out.println("\n Employee ID :" + employee.getEmpId());
		System.out.println("\n Employee Name :" + employee.getEmpName());
		System.out.println("\n Employee Post :" + employee.getEmpPost());
		System.out.println("\n Employee Salary :" + employee.getEmpSalary());
		System.out.println("\n Employee Contact Number :" + employee.getEmpContactNumber());
		System.out.println("\n Employee UId :" + employee.getEmpUId());
		
		String employeeDOB = simpleDateFormat.format(employee.getEmpDOB());
		System.out.println("\n Employee DOB :" + employeeDOB);
		
	}
}
