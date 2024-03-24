package com.sathya.batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##scott","welcome");

		 Statement statement=connection.createStatement();
		 statement.addBatch("create table student(id number,name varchar2(20))");
		 statement.addBatch("insert into student values(111,'Navya')");
		 statement.addBatch("insert into student values(222,'Venkat')");;
		 statement.addBatch("insert into student values(333,'Loukya')");;
		 statement.addBatch("delete from student where id in(111,222)");
		 statement.addBatch("drop table student");
		 
		 int [] results=statement.executeBatch();
		 for(int result:results)
			 System.out.println(result);
		 
		 connection.close();
		 

	}

}
