package com.csi.hrmapp;

public class EnumConcept {

	public enum Days {
		
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
		
	}
	
	public static void main(String[] args) {
		
		for(Days d : Days.values())
		{
			System.out.println(d);
		}
		
		for(Days d : Days.values())
		{
			if(d.toString().equals("Sunday"))
			{
				System.out.println("Weekend");
			} 
		}
	}
}
