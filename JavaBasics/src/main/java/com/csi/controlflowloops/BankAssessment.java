package com.csi.controlflowloops;

import java.util.Scanner;

public class BankAssessment {
	
	static int otpGerneratedFromSystem()
	{
		return (int) (Math.random()*9000+1000);
	}

	public static void main(String[] args) {

		String accountNumber = "abcd";
		String accountPassword = "4567";

		int accountBalance = 3000, amount, accNo,otp, generatedOTP;
		boolean flag;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\n Please Enter Username & Password : ");

			String an = scanner.nextLine();
			String ap = scanner.nextLine();

			if (accountNumber.equals(an) && accountPassword.equals(ap)) {
				System.out.println("Welcome to SBI");
				flag = false;
			} else {
				System.out.println("Please Enter Valid Credentials");
				flag = true;
			}
		} while (flag);

		do {
			
			System.out.println("\n 1.Deposit \n 2.Withdraw \n 3.Transfer \n 4.Logout");

			int c = scanner.nextInt();
		switch (c) {
		case 1:
			System.out.println("\n Please Enter the Amount for Deposit :");
			amount = scanner.nextInt();
			accountBalance = accountBalance + amount;
			System.out.println("\n After Deposit Amount is :" + accountBalance);
			break;
		case 2:
			System.out.println("\n Please Enter the Amount for Withdraw :");
			amount = scanner.nextInt();
			accountBalance = accountBalance - amount;
			System.out.println("\n After Withdraw Amount is : " + accountBalance);
			break;
		case 3:
          
			System.out.println("\n Please Enter the Account Number & Amount to Transfer :");
			accNo = scanner.nextInt();
			amount = scanner.nextInt();
			
			otp = otpGerneratedFromSystem();
			if(amount <= accountBalance) {
				
				System.out.println(otp);
				System.out.println("\n Please Enter OTP : ");
				generatedOTP = scanner.nextInt();
				if(otp==generatedOTP) {

					accountBalance = accountBalance - amount;
					System.out.println("\n After transfer Amount is :" + accountBalance);
				}else {
					System.out.println("Invalid OTP");
				}
	
			} else {
				System.out.println("Insufficient Funds");
			}
			break;
		case 4:

			flag = false;
			System.out.println("Logout Successfully");
			break;

		default:
			break;
		}
		}while(true);
	}
}
