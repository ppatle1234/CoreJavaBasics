package com.csi.jdk18features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

class Emp 
{
	private int empId;
	
	private String empName;
	
	private int empAge;
	
	private double empSalary;

	public Emp(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
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

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
public class StreamAPIconceptpart2 {
	
	public static void main(String[] args) {
		
		List<Emp> empList = new ArrayList<Emp>();
		
		empList.add(new Emp(151, "Sunil", 26, 2313.43));
		empList.add(new Emp(152, "Virat", 36, 145624.76));
		empList.add(new Emp(153, "Kiran", 43, 12907.63));
		empList.add(new Emp(162, "Rajesh", 23, 43876.45));
		empList.add(new Emp(121, "Akash", 32, 10000.34));
		
		/*
		 * long count = empList.stream().collect(Collectors.counting());
		 * 
		 * System.out.println(count);
		 */
		
		// Sort record by Salary using stream API
		
		// empList.stream().filter(emp -> emp.getEmpSalary() >= 50000.654).forEach(System.out::println);
		
		// Sort record by Age using stream API
 		// empList.stream().sorted(Comparator.comparingLong(Emp :: getEmpAge)).forEach(emp -> System.out.println(emp));
		
		// Sort record by Name using stream API
		
		
		//  Type - (1) 
		/*
		 * List result = empList.stream().sorted((e1, e2) ->
		 * e1.getEmpName().compareTo(e2.getEmpName())).collect(Collectors.toList());
		 * 
		 * System.out.println(result);
		 * 
		 */
		
		 // Type - (2) 
		
		   empList.stream().sorted((e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName())).forEach(System.out::println);
		  
			
		
	}

}
