package com.csi.arrayconcept;

import java.util.Arrays;

public class ArrayBasics {
	
	public static void main(String[] args) {
		int []arr = {3,1,0,6,2,9,8,7,5};
		
		Arrays.parallelSort(arr);
		
		for(int element : arr)
		{
			System.out.println(element);
		}
		
		System.out.println(arr.length);
	}

}
