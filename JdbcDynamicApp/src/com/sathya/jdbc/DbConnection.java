package com.sathya.jdbc;

import java.sql.*;

public class DbConnection {
	//This method create the connection and return connection
	public static Connection createconnection()
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
