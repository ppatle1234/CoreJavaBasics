package com.csi.controlstatement;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		System.out.println("\n Please Enter two number :");
		
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int result;
		
		System.out.println("\n Please Enter the Choice :");
		System.out.println("\n 1. Add \n 2. Sub \n 3. Mul \n 4. Div");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1: 
			result = n1 + n2 ;
			System.out.println("\n Addition Result :" + result);
			break;
			
		case 2:
			result = n1 - n2;
			System.out.println("\n Subtraction Result :" + result);
			break;
			
		case 3:
			result = n1 * n2;
			System.out.println("\n Multiplication Result :" + result);
			break;
			
		case 4:
			result = n1 / n2;
			System.out.println("\n Division Result :" + result);
			break;
		case 5:
			System.out.println("\n Exited");
			System.exit(0);
			break;
		
			default:
				
			break;
		}
	}
	
}
