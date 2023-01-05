package com.csi.exceptioncoreconcept;

public class ExceptionAgeExample {

	public static void main(String[] args) {
		
		try {
			isAgeValidtodoVote(20);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			System.out.println("Prashant");
		}
		
	}

	public static void isAgeValidtodoVote(int age) throws InvalidAgeException  {
		
		if (age < 18) {
			throw new InvalidAgeException("Not Eligible For Vote");
		} else {
           System.out.println("Eligible For Vote");
		}
	}

}
