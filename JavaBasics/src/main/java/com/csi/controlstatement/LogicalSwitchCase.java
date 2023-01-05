package com.csi.controlstatement;

import java.util.Scanner;

import com.csi.controlflowloops.WhileLoopConcept;

public class LogicalSwitchCase {

	public static void main(String[] args) {
		// Arithmetic Operation Using Switch Case

		System.out.println("\n Please Enter two number of choice :");
		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int result = 0;

		do {
		System.out.println("\n Please Enter Choice :");
		System.out.println("\n 1.Add \n 2.Sub \n 3.Mul \n 4.Div \n 5.Exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
             result = n1 + n2;
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
			System.out.println("Invalid Choice");
			break;
		}

	}while(true);
	}

}
