package com.csi.jdbcconcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCCrudConcept {
	public static void main(String[] args) {

		Connection connection = null;

		// Steps for JDBC

		// 1. Load Driver Class

		// 2. Connect to DB

		// 3. Create Statement

		// 4. Execute Query

		// 5. Close Connection

		try {
			// 1. Load Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connect to DB
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prashantapp", "root", "root");

			/*
			 * // Create Database String createDBSQL = "create database prashantapp";
			 */

			// 3. Create Statement

			Statement statement = connection.createStatement();

			/*
			 * // 4. Execute Query statement.executeUpdate(createDBSQL);
			 * 
			 * System.out.println("DB Create Successfully.");
			 */

			// Create Table

			/*
			 * String createTABLESQL =
			 * "create table prashank(pkid int,pkname varchar(255),pkaccbl varchar(255))";
			 * 
			 * statement.executeUpdate(createTABLESQL);
			 * 
			 * System.out.println("Table Created Successfully.");
			 */

			
			/*
			 * // Insert record
			 * 
			 * String insertSQL =
			 * "insert into prashank (pkid,pkname,pkaccbl) values(133,'TIks','2560')";
			 * 
			 * statement.executeUpdate(insertSQL);
			 * 
			 * System.out.println("Data Inserted Successfully.");
			 */
			  
			 
			/*
			 * // Update record
			 * 
			 * String updateSQL =
			 * "update prashank set pkname = 'chawla', pkaccbl = '340' where pkid = 131";
			 * 
			 * statement.executeUpdate(updateSQL);
			 * 
			 * System.out.println("Data Updated Successfully.");
			 */

			// Delete record
			
			String deleteSQL = "Delete from prashank where pkid = 133";
			
			statement.executeUpdate(deleteSQL);
			
			System.out.println("Data Deleted Successfully.");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
