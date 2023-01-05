package com.csi.controlstatement;

import java.util.Scanner;

public class NestedIfElseConcept {

	public static void main(String[] args) {
		System.out.println("\n Please Check the Grade Level of Student :");
		
		do {
		Scanner scanner = new Scanner(System.in);
		
		int marks = scanner.nextInt();
		
		if(marks >= 75) {
			System.out.println("Distinction");
		} else if (marks >= 65) {
			System.out.println("First Class");
		} else if (marks >= 55) {
			System.out.println("Second Class");
		} else if (marks >= 50){
			System.out.println("Third Class");
		} else {
			System.out.println("Invalid Data");
		}
		}while(true);
	}
		
}
