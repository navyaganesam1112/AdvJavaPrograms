package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcFirstApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step-1 Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 System.out.println("Driver created Successfully...");
		 
		 //Step-2 create the connection 
		 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##scott","welcome");
		 System.out.println("connection created successfully");
		 
		 //step-3 Process the query
		 // Static query excecution
		 Statement statement =connection.createStatement();
		 String q1="create table emp(id number(5),name varchar2(10),salary number(8,2))";
		 int res1=statement.executeUpdate(q1);
		 System.out.println("Table created successfully...."+res1);
		 
//		 String q2="drop table emp";
//		 int res2=statement.executeUpdate(q2);
//		 System.out.println("Table dropped successfully...."+res2);
//		 
//		 
		
		
		
		 
		 //step-4: Release the resources
		 connection.close();
		 System.out.println("connection closed successfully");
	}

}
