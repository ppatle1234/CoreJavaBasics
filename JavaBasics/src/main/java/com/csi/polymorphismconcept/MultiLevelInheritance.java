package com.csi.polymorphismconcept;

import java.util.Date;

class Company
{
	void showCompanyInfo(int companyId, String companyName, Date companyStartDate)
	{
		
	}
}

class Product extends Company
{
	void showProductInfo(int productId , String productName, Date productLaunchDate)
	{
		
	}
}

class Cust extends Product
{
	void showCustInfo(int custId, String custName, Date custDOB)
	{
		
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		
		Cust cust = new Cust();
		
		cust.showCompanyInfo(101, "TCS", new Date());
		
		
	}

}
