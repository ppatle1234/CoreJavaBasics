package com.csi.core;

class Machine
{
	int partId = 111;
	String partName = "Xerox";
}

public class AccessModifierBasics {

	public static void main(String[] args) {
		
		Machine machine = new Machine();
		
		System.out.println("\n Machine Id :" + machine.partId + "\n Machine Name :" + machine.partName);
	}

}
