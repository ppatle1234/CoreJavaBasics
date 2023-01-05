package com.csi.jdk18features;

interface Customer
{
	void get();
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		Customer cc = () -> {
			System.out.println("Prashant");
		};
		
		cc.get();
	}
	
}

