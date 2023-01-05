package com.csi.exceptioncoreconcept;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

class Dept
{
	void get() throws IOException
	{
		
	}
}

class Emp extends Dept 
{
	void get() throws ArithmeticException
	{
		
	}
}

public class ExceptionScenarios {

	public static void main(String[] args) {

		
		try {
					
		} 
		catch (ArithmeticException e) {
			
		} catch (NullPointerException e) {
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
		} catch (Exception e) {
			
		}
		 

		try (Scanner scanner = new Scanner(System.in)) {

		}

	}

}
