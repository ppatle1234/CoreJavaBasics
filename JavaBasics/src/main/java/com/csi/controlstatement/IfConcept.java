package com.csi.controlstatement;

import java.util.Scanner;

public class IfConcept {
	
	public static void main(String[] args) {
		System.out.println("\n Please Enter the Marks :");
		
		Scanner scanner = new Scanner(System.in);
		
		int marks = scanner.nextInt();
		
		if(marks >= 75) {
			System.out.println("Eligible For Admission");
		} else {
			System.out.println("Not Eligible For Admission");
		}
	}

}
