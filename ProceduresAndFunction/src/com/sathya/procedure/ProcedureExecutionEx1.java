package com.sathya.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureExecutionEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##scott","welcome");
		//call the procedure
		CallableStatement callableStatement=connection.prepareCall("{call getSal(?,?)}");
		//set the input data
		callableStatement.setInt(1,1054);
		//register one variable to store the output
		callableStatement.registerOutParameter(2,Types.FLOAT);
		//execute the procedure the output will be storedd in registered parameter
		callableStatement.executeUpdate();
		//Get the output
		System.out.println(callableStatement.getFloat(2));
		connection.close();

	}

}
