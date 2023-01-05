package com.csi.hrmapp;

public class FinalizeCoreConcept {

	public void finalize()
	{
		System.out.println("I am from Finalize.");
	}
	public static void main(String[] args) {
	
		FinalizeCoreConcept fConcept = new FinalizeCoreConcept();
		fConcept = null;
		System.gc();
	}
}
