package com.sathya.function;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionExecutionEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##scott","welcome");
		//call the procedure
		CallableStatement callableStatement=connection.prepareCall("{?=call getAvg(?,?)}");
		//set the input data
		callableStatement.setInt(2,1054);
		callableStatement.setInt(3,1024);
		//register one variable to store the output
		callableStatement.registerOutParameter(1,Types.DOUBLE);
		
		//execute the procedure the output will be stored in registered parameter
		callableStatement.executeUpdate();
		
				//Get the output
				System.out.println(callableStatement.getDouble(1));
				
				connection.close();
	}

}
