package com.csi.filehandlingcoreconcept;

import java.io.File;
import java.io.IOException;

public class CreateNewFiletwo {

	public static void main(String[] args) {
		
		File file = new File("E://MAKS/ff.txt");
		
		try {
			if(file.createNewFile())
			{
				System.out.println("\n File Created Successfully : " + file.getName());
			} else {
				System.out.println("\n File Already Exists : ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
