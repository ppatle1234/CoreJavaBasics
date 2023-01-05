package com.csi.filehandlingcoreconcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadConceptThree {
	
	public static void main(String[] args) {
		
		File file = new File("E://MAKS/pkd.txt");
		
		try {
		
			Scanner scanner = new Scanner(file);
			String filename = scanner.nextLine();
			System.out.println(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
