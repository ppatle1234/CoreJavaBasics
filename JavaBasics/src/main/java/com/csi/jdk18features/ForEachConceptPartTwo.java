package com.csi.jdk18features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Department
{
	private int deptId;
	private String deptName;
	private String deptArea;
	private String deptCity;
	private String deptState;
	private int deptCode;
	private boolean deptStatus;
	
	public Department(int deptId, String deptName, String deptArea, String deptCity, String deptState, int deptCode,
			boolean deptStatus) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptArea = deptArea;
		this.deptCity = deptCity;
		this.deptState = deptState;
		this.deptCode = deptCode;
		this.deptStatus = deptStatus;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptArea() {
		return deptArea;
	}

	public void setDeptArea(String deptArea) {
		this.deptArea = deptArea;
	}

	public String getDeptCity() {
		return deptCity;
	}

	public void setDeptCity(String deptCity) {
		this.deptCity = deptCity;
	}

	public String getDeptState() {
		return deptState;
	}

	public void setDeptState(String deptState) {
		this.deptState = deptState;
	}

	public int getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	public boolean isDeptStatus() {
		return deptStatus;
	}

	public void setDeptStatus(boolean deptStatus) {
		this.deptStatus = deptStatus;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptArea=" + deptArea + ", deptCity="
				+ deptCity + ", deptState=" + deptState + ", deptCode=" + deptCode + ", deptStatus=" + deptStatus + "]";
	}
	
	
}

public class ForEachConceptPartTwo {
	
	public static void main(String[] args) {
		
		List<Department> deptList = new ArrayList<Department>();
		
		deptList.add(new Department(10, "Finance", "Manish Nagar", "Nagpur", "Maharashtra", 442230, true));
		deptList.add(new Department(20, "Account", "Akurdi", "Pune", "Maharashtra", 334480, false));
		deptList.add(new Department(30, "HR", "Ammerpeth", "Hyderabad", "Telangana", 440355, true));
		deptList.add(new Department(40, "IT", "Bandra West", "Mumbai", "Maharashtra", 443011, true));
		
	//	System.out.println(deptList);
		
	/*
	 * for(Department department : deptList) 
	 * {
	 *    System.out.println(department); 
	 *    
	 * }
	 */
		
	//	deptList.forEach(d -> System.out.println(d));
		
		deptList.forEach(System.out::println);
		
		
	}
	
}
