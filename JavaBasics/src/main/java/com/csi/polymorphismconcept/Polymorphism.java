package com.csi.polymorphismconcept;


class Nation 
{
	void net(int nId, String nName) {
		System.out.println("\n Nation Id :"+ nId +"\n Nation Name :"+ nName);
	}
	
	void net(int nCode) {
		System.out.println("\n Nation Code :" + nCode);
	}
}

class State extends Nation
{
	void net(int nId, String nName) {
		super.net(121, "Delhi Capital");
		System.out.println("\n Nation Id :" + nId + "\n Nation Name :" + nName);
	}
}
public class Polymorphism {
	
	public static void main(String[] args) {
		State state = new State();
		
		state.net(151, "Maharashtra");
		state.net(312);
	
	}
	
}
