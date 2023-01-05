package com.csi.stringconcept;

import java.util.Arrays;

public class RepeatedChars {

	public static void main(String[] args) {
		
		String str = "ahemednagar";
		
		char a[] = str.toCharArray();
		
		Arrays.sort(a);
		
		for(int i=0; i< a.length; i++)
		{
			int c = 1;
			char t = a[i];
			for(int j = i + 1; j < a.length; j++)
			{
				if(t == a[j])
				{
					c++;
					i++;
				} else {
					 break;
				}
			}
			
			if(c > 1)
				System.out.println(t + ":" + c);
		}
	}
}
