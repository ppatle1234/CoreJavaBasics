package com.csi.jdbcconcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCCrudTwo {

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userapplication", "root","root");
	
				Statement statement = connection.createStatement();
				
				/*
				 * // Create Database
				 * 
				 * String createDBSQL = "create database userapplication";
				 * 
				 * statement.execute(createDBSQL);
				 * 
				 * System.out.println("DB Created Successfully.");
				 * 
				 */
				
				
				/*
				 * // Create Table
				 * 
				 * String createTableSQL = "create table userdata(userid int, username varchar(255), useraccbal double)";
				 * 
				 * statement.executeUpdate(createTableSQL);
				 * 
				 * System.out.println("Table Created Successfully.");
				 */
				 
				 
				/*
				 * // Insert record
				 * 
				 * String insertSQL =
				 * "insert into userdata(userid, username,useraccbal) values (123,'Venkat', 5600.20)"
				 * ;
				 * 
				 * statement.execute(insertSQL);
				 * 
				 * System.out.println("Data Insert Successfully");
				 */
					
				/*
				 * // Update Record
				 * 
				 * String updateSQL =
				 * "update userdata set username = 'Shekhar' where userid = 121";
				 * 
				 * statement.execute(updateSQL);
				 * 
				 * System.out.println("Data Updated Successfully.");
				 */
				
				/*
				 * // Delete Record
				 * 
				 * String deleteSQL = "Delete from userdata where userid = 123";
				 * 
				 * statement.execute(deleteSQL);
				 * 
				 * System.out.println("Data Deleted Successfully.");
				 * 
				 */
				
				// Read Data
				
				String selectSQL = "select * from userdata";
				
				ResultSet resultSet = statement.executeQuery(selectSQL);
				
				while (resultSet.next()) {
					System.out.println(""+ resultSet.getInt(1) +"\t "+ resultSet.getString(2)+"\t "+ resultSet.getDouble(3));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
;