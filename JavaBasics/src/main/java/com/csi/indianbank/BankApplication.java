package com.csi.indianbank;

import java.util.Scanner;

public class BankApplication {

	static int otpGeneratedFromSystem()
	{
		return (int) (Math.random()*9000+1000);
	}

	public static void main(String[] args) {

		String accountNumber = "1234";

		String accountPassword = "abcd";

		int accountBalance = 2000 , amount , choice, accNo, otp,generatedOTP;

		boolean flag;

		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("\n Please Enter the Account Number & Password :");

			String aN = scanner.nextLine();
			
			String aP = scanner.nextLine();
			

			if(accountNumber.equals(aN) && accountPassword.equals(aP))
			{
				System.out.println("\n Welcome To the Indian Bank");
				flag = false;
			}
			else {

				System.out.println("\n Invalid Credentials");
				flag = true;
			}
		}while(flag);

		do {
		System.out.println("\n 1.Deposit \n 2.Withdraw \n 3.Transfer \n 4.Logout");

		choice = scanner.nextInt();

		switch (choice) {
		case 1:  // Deposit

			System.out.println("\n Please Enter the Amount for Deposit :");
			amount = scanner.nextInt();
			accountBalance = accountBalance + amount;

			System.out.println("\n Account Balance is : " + accountBalance);
			break;

		case 2:  // Withdraw

			System.out.println("\n Pleasse Enter the Amount for Withdraw : ");
			amount  = scanner.nextInt();
			accountBalance = accountBalance - amount;

			System.out.println("\n Withdraw Balance is :" + accountBalance);
			break; 
		case 3: // Transfer

			System.out.println("\n Please Enter the Account & Amount for Transfer : ");
			accNo = scanner.nextInt();
			amount = scanner.nextInt();

			otp = otpGeneratedFromSystem();
			if(amount <= accountBalance)
			{
				//amount  = scanner.nextInt();
				System.out.println(otp);
				System.out.println("\n Please Enter OTP :");
				generatedOTP = scanner.nextInt();
				if(otp == generatedOTP)
				{
					accountBalance = accountBalance - amount;
					System.out.println("\n After Transfer Account Balance is : " + accountBalance);
				} else {
					System.out.println("\n Incorrect OTP please enter correct one : ");
				}


			}else {
				System.out.println("\n Insufficient Funds.");
			}

			break; 

		case 4: //Logout 

			flag = false;
			System.out.println("\n Logout Successfully.");
			break;

		default:
			break;
		}
		}while(true);


	}

}
