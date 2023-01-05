package com.csi.filehandlingcoreconcept;

import java.io.File;

public class DeleteFileConceptThree {

	public static void main(String[] args) {
		
		File file = new File("E://MAKS/pkd.txt");
		
		file.delete();
		
		System.out.println("File Deleted Successfully.");
	}
}
