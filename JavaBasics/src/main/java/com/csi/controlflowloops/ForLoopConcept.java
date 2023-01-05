package com.csi.controlflowloops;

import java.util.Scanner;

public class ForLoopConcept {

	public static void main(String[] args) {

		System.out.println("\n Please Enter the Name of Your Company and How Many times you want to print :");

		do {

			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			int n = scanner.nextInt();

			int i;
			for (i = 1; i <= n; i++) {
				System.out.println(name);
			}
		} while (true);
	}

}
