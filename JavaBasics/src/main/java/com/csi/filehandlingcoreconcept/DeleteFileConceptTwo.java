package com.csi.filehandlingcoreconcept;

import java.io.File;

public class DeleteFileConceptTwo {

	public static void main(String[] args) {
		File file = new File("E://MAKS/ott.pdf");
		
		file.delete();
		
		System.out.println("File Deleted Successfully.");
	}
}
