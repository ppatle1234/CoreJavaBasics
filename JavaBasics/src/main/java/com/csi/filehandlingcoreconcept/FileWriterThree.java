package com.csi.filehandlingcoreconcept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterThree {

	public static void main(String[] args) {
		
		File file = new File("E://MAKS/pkd.txt");
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Prashant Patle Sr Java Developer.");
			fileWriter.close();
			System.out.println("File Write Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
