package com.csi.arrayconcept;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCoreConcept {

	public static void main(String[] args) {
		
		Map<String, String> tMap = new TreeMap<String, String>();
		
		tMap.put("\n Salary", "90000");
		tMap.put("\n Department", "IT");
		tMap.put("\n ID", "1001");
		tMap.put("\n Address", "Nagpur");
		tMap.put("\n Name", "Prashant Patle");
		
		for(Map.Entry<String, String> m : tMap.entrySet())
		{
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}
}
