package com.csi.jdbccore;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productmgmt", "root", "root");

			PreparedStatement preparedStatement = connection.prepareStatement("insert into imgtable values (?,?)");

			preparedStatement.setString(1, "CS LOGO");

			FileInputStream fileInputStream = new FileInputStream("E://Force.png");

			preparedStatement.setBinaryStream(2, fileInputStream, fileInputStream.available());

			preparedStatement.executeUpdate();

			System.out.println("Image Inserted Successfully.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
