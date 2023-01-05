package com.csi.jdbccore;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Blob;

public class ReadSqlImage {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productmgmt", "root","root");

			PreparedStatement ps = connection.prepareStatement("select * from imgtable");
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {   // now on 1st row
				
				Blob b = rs.getBlob(2); // 2 means second column data
				byte barr[] = b.getBytes(1, (int) b.length());  // 1 means first image
				
				FileOutputStream fout = new FileOutputStream("E:\\Envm.jpg");
				
				fout.write(barr);
				
				fout.close();
			
			}
			
			System.out.println("Ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
