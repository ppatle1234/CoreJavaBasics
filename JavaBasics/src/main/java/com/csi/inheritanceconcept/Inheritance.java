package com.csi.inheritanceconcept;

class Department {
	int deptCode = 23;
	void get(int deptId, String deptName, long deptcnum) {
		System.out.println("\n Dept Id :" + deptId + "\n Dept Name :" + deptName + "\n Dept Number :" + deptcnum);
	}

	void show() {
		System.out.println("\n I am from Dept Show.");
	}
}

class Employee extends Department {
	int deptCode = 33;
	void set(int empId, String empName, double empSalary) {
		System.out.println("\n Employee Id :" + empId + "\n Employee Name :" + empName + "\n Employee Salary :" + empSalary + "\n Department Code :" + super.deptCode);
	}

	void displayInfo() {
		System.out.println("\n I am from Emp");
		super.show();
	}
}

/*
 * class Company extends Employee { void showCompanyInfo(int companyId, String
 * companyName, String companyAddrress) { System.out.println("\n Comapny ID : "
 * + companyId + "\n Company Name : " + companyName + "\n Company Address : " +
 * companyAddrress);
 * 
 * } }
 * 
 * class Product extends Company { void showProductInfo(int productId, String
 * productName, double productPrice) { System.out.println("\n Product ID :" +
 * productId + "\n Product Name : " + productName + "\n Product Price :" +
 * productPrice); } }
 * 
 * class Item extends Product { void showItemInfo(int itemId, String itemName) {
 * System.out.println("\n Item ID :" + itemId + "\n Item Name :" + itemName); }
 * }
 */
public class Inheritance {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.get(111, "Mahesh", 2345533L);
	    employee.set(121, "Rahul", 234553.0);
		employee.displayInfo();
		
		/*
		 * Item item = new Item();
		 * 
		 * item.get(101, "FINANCE"); item.set(121, "Rudra"); item.displayData(45000.65,
		 * "PUNE"); item.showCompanyInfo(151, "RELIANCE", "MUMBAI");
		 * item.showProductInfo(153, "Oil", 678.90); item.showItemInfo(170, "SODA");
		 */
	}

}
