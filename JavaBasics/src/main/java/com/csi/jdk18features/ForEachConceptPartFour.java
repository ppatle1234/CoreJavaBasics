package com.csi.jdk18features;

import java.util.ArrayList;
import java.util.List;

class Company 
{
	private int companyId;
	private String companyName;
	private String companyAddress;
	private int companyCode;
	private String companyType;
	public Company(int companyId, String companyName, String companyAddress, int companyCode, String companyType) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyCode = companyCode;
		this.companyType = companyType;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyCode=" + companyCode + ", companyType=" + companyType + "]";
	}
	
	
}

public class ForEachConceptPartFour {
	
	public static void main(String[] args) {
		
		List<Company> companyList = new ArrayList<Company>();
		
		companyList.add(new Company(101, "TCS", "Bengaluru", 2098, "Private Limited"));
		companyList.add(new Company(102, "PWD", "Nashik", 2121, "Government Undertaking"));
		companyList.add(new Company(103, "Honda", "Delhi", 2145, "Private Limited"));
		companyList.add(new Company(104, "Reliance", "Gujarat", 4197, "Limited"));
		
		/* System.out.println(companyList); */
		
		/*
		 * for(Company c : companyList) { System.out.println(c); }
		 */
		
		/* companyList.forEach(c -> System.out.println(c)); */
		
		companyList.forEach(System.out::println);
		
	}

}
