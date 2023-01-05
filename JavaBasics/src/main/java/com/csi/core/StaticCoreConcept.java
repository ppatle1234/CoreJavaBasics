package com.csi.core;

import com.csi.core.Dept.Emp;

class Dept 
{
	static class Emp {
		void add() 
		{
			System.out.println("I am from add");
		}
	}
}

public class StaticCoreConcept {

	static {
		System.out.println("JKL");
	}
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.add();
		StaticCoreConcept staticCoreConcept = new StaticCoreConcept();	
		staticCoreConcept.display();
		show();
		System.out.println("IT Park Pune");
		
	
	}
	
	static void show()
	{
		System.out.println("CSI");
	}
	
	void display()
	{
		System.out.println("Pune");
	}
	
	static {
		System.out.println("React Js");
	}
	
}
