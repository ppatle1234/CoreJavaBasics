package com.csi.inheritanceconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateConcept {
	public static void main(String[] args) {
		
		// dd-MM-yyyy  India
		// MM-dd-yyyy  USA/CANADA
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Date dobDate = null;
		
		try {
			dobDate = simpleDateFormat.parse("11-11-1999");
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		String dob = simpleDateFormat.format(dobDate);
		
		System.out.println(dob);
		
		System.out.println(LocalDateTime.now());
		
		
	}

}
