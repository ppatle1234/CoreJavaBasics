package com.csi.exceptioncoreconcept;

public class ExceptionConcept {

	public static void main(String[] args) {

		
		/*
		 * try { int res = 10/0; System.out.println(res); } catch (ArithmeticException
		 * e) { e.printStackTrace(); // TODO: handle exception } finally {
		 * System.out.println("Prashant"); }
		 */

		try {
			
		//	int res = 10/0;
		//	System.out.println(res);
		//	String companyName = null;
		//	System.out.println(companyName.length());
			
			String cArr[] = {"TCS","INFOSYS","WIPRO","CAPGEMINI","ACCENTURE","DELOITE","HCL"};
			int i;
			for(i = 0; i<= cArr.length ; i++)
			{
				System.out.println(cArr[i]);
			}
			
			
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			System.out.println("Prashant");
		}
		 

	}

}
