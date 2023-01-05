package com.csi.hrmapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyCoreConcept {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		
		try {
	
				Class.forName("com.mysql.jdbc.Driver");
			
			try {
				connection = DriverManager.getConnection("url", "un", "pwd");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			connection.close();
		}
	}
}
