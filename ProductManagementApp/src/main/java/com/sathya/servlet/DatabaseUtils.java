package com.sathya.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
	//This method create the connection and return connection
			public static Connection createConnection()
			{
				Connection connection =null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##scott","welcome");
					
				}
				catch (ClassNotFoundException |SQLException e) {
					e.printStackTrace();
				}
				return connection;
				
			}
}
