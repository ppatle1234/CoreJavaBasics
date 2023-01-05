package com.csi.controlstatement;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		
		String userName = "abcd";
		String userPwd = "pass123";
		boolean flag;
		
		System.out.println("\n Please Enter UserName & Password :");
		do {
		Scanner scanner = new Scanner(System.in);
		
		String uN = scanner.nextLine();
		String uP = scanner.nextLine();
		
		if(userName.equals(uN) && userPwd.equals(uP)) {
			System.out.println("Welcome To Indian Bank");
			flag = false;
		} else {
			System.out.println("Invalid Credentials Please try Correct One");
			flag = true;
		}
		}while(flag);
	}
	
}
