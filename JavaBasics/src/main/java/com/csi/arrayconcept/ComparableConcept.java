package com.csi.arrayconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>
{
	private int empId;
	private String empName;
	private int empAge;
	
	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
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

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		if(empAge == e1.empAge)
		{
			return 0;
		} else if (empAge > e1.empAge) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
	
	
	
	
}

public class ComparableConcept {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(101, "Binu", 24));
		empList.add(new Employee(102, "Akash", 21));
		empList.add(new Employee(103, "Shanu", 25));
		empList.add(new Employee(104, "Ram", 20));
		empList.add(new Employee(105, "Vishnu", 25));
		empList.add(new Employee(106, "Sanju", 28));
		
    //  System.out.println(empList);
		
		Collections.sort(empList);
		
		/*
		 * for(Employee e : empList) { System.out.println(e); }
		 */
		
		/* empList.forEach(e -> System.out.println(e)); */
		
		empList.forEach(System.out::println);
		
	}

}
