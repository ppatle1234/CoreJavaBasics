package com.csi.jdbcconcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConcept {
 
	public static void main(String[] args)  {

		Connection connection = null;

		// Steps for  JDBC

		// 1. Load Driver Class

		// 2. Connect to DB

		// 3. Create Statement

		// 4. Execute Query

		// 5. Close Connection

		try {

			// 1. Load Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connect to DB
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prashantdb","root","root");

				// 3. Create Statement
				Statement statement = connection.createStatement();

				// 4. Execute Query
				ResultSet resultSet = statement.executeQuery("SELECT * FROM pdetail");

				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1)+"\t "+resultSet.getString(2)+"\t "+resultSet.getString(3)+"\t "+resultSet.getDouble(4));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			// 5. Close connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
