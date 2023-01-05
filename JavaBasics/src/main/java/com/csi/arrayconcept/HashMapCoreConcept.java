package com.csi.arrayconcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapCoreConcept {
	
	public static void main(String[] args) {
		
		Map<String, String> hMap = new HashMap<String, String>();
		
		hMap.put("Salary", "322.33");
		hMap.put("Department", "Finance");
		hMap.put("ID", "101");
		hMap.put("Name", "Prashant");
		hMap.put("Address", "Nagpur");
		
		for(Map.Entry<String, String> m : hMap.entrySet())
		{
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}
	
}
