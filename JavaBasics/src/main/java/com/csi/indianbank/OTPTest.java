package com.csi.indianbank;

public class OTPTest {
	public static void main(String[] args) {
		
		int otp = (int) (Math.random()*9000+1000);
		System.out.println(otp);
	}

}
