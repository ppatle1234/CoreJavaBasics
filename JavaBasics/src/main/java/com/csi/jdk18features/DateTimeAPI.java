package com.csi.jdk18features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeAPI {

	public static void main(String[] args) {
		
		System.out.println("\n JDK 7 Date : " + new Date());
		System.out.println("\n JDK 8 Local Date : " + LocalDate.now().getDayOfMonth());
		System.out.println("\n JDK 8 Local Date Time : " + LocalDateTime.now());
	}
}
