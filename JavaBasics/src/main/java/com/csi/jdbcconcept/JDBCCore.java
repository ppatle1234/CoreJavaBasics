package com.csi.jdbcconcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCore {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmgmt","root","root");
		
				Statement statement = connection.createStatement();
				
				ResultSet resultSet = statement.executeQuery("select * from employee");
				
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1)+"\t"+ resultSet.getString(2)+"\t"+ resultSet.getString(3)+"\t"+ resultSet.getDouble(4));
					
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
