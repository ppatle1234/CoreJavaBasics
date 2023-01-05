package com.csi.filehandlingcoreconcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadCoreConcept {

	public static void main(String[] args) {
		
		File file = new File("E://MAKS/ff.txt");
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
