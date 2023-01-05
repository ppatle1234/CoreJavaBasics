package com.csi.filehandlingcoreconcept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterConceptTwo {
	

	public static void main(String[] args) {
		
		File file = new File("E://MAKS/ff.txt");
		
		try {
			FileWriter	filewriter = new FileWriter(file);
			filewriter.write("Prashant");
			filewriter.close();
			
			System.out.println("\n File Write Successfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
