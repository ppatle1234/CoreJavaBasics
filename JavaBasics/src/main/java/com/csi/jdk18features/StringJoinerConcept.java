package com.csi.jdk18features;

import java.util.StringJoiner;

public class StringJoinerConcept {
	
	public static void main(String[] args) {
		
		StringJoiner stringJoiner = new StringJoiner("$");
		
		stringJoiner.add("TCS");
		stringJoiner.add("Infosys");
		stringJoiner.add("Wipro");
		stringJoiner.add("Cognizant");
		
		System.out.println(stringJoiner);
	}

}
