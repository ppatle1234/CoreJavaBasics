package com.csi.hrmapp;

public class EnumConceptTwo {

    public enum Companies 
    {	
		TCS, WIPRO, INFOSYS
	}
    
    public static void main(String[] args) {
    	
    	for(Companies c : Companies.values())
    	{
    		System.out.println(c);
    	}
		
    	for(Companies c : Companies.values())
		{
			if(c.toString().equals("TCS"))
			{
				System.out.println("Top Three Tier");
			}

		}
	}
}
