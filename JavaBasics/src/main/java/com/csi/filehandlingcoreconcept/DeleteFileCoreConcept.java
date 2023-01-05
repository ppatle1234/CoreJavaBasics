package com.csi.filehandlingcoreconcept;

import java.io.File;

public class DeleteFileCoreConcept {

    public static void main(String[] args) {
		
    	File file = new File("E://MAKS/ff.txt");
    	
    	file.delete();
    	
    	System.out.println("File Deleted Successfully");
	}
}
