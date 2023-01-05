package com.csi.hrmapp;

public class EnumCoreConcept {

	public enum Months 
	{
		JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
	}
	
	public static void main(String[] args) {
		for(Months m : Months.values())
		{
			System.out.println(m);
		}
		
		System.out.println("=====================================");
		
		for(Months m : Months.values())
		{
			if(m.toString().equals("NOVEMBER"))
			{
				System.out.println("My Birthday is Coming Soon.");
			}
		}
	}
}
