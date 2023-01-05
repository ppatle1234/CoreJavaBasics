package com.csi.filehandlingcoreconcept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCoreConcept {

	public static void main(String[] args) {
		
		File file = new File("E://MAKS/PP.txt");
		
		try {
			
			FileWriter fileWriter = new FileWriter(file);
			
			fileWriter.write("Prashant Patle Nagpur, Sr Java Developer");
			
			fileWriter.close();
			
			System.out.println("File Write Successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
