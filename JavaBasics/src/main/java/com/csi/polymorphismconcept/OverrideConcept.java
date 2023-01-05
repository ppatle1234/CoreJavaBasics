package com.csi.polymorphismconcept;

class Bank
{
	int rateOfInterest()
	{
		return 0;
	}
}

class HDFCBank extends Bank
{
	int rateOfInterest()
	{
		return 12;
	}
}

class ICICIBank extends Bank
{
	int rateOfInterest()
	{
		return 15;
	}
}

class AXISBank extends Bank
{
	int rateOfInterest()
	{
		return 13;
	}
}

class BOBBank extends Bank
{
	int rateOfInterest()
	{
		return 18;
	}
}
public class OverrideConcept {
	
	public static void main(String[] args) {
		
		Bank hdfcBank = new HDFCBank();
		Bank iciciBank = new ICICIBank();
		Bank axisBank = new AXISBank();
		Bank bobBank = new BOBBank();
		
		System.out.println("\n ROI of HDFC Bank is :" + hdfcBank.rateOfInterest());
		System.out.println("\n ROI of ICICI Bank is :" + iciciBank.rateOfInterest());
		System.out.println("\n ROI of AXIS Bank is :" + axisBank.rateOfInterest());
		System.out.println("\n ROI of BOB Bank is :" + bobBank.rateOfInterest());
	}
}
