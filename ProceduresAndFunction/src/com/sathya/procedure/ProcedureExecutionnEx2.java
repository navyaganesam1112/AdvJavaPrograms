package com.sathya.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureExecutionnEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##scott","welcome");
		//call the procedure
		CallableStatement callableStatement=connection.prepareCall("{call getDetails(?,?,?,?)}");
		//set the input data
		callableStatement.setInt(1,1054);
		//register one variable to store the output
		callableStatement.registerOutParameter(2,Types.INTEGER);
		callableStatement.registerOutParameter(3,Types.NVARCHAR);
		callableStatement.registerOutParameter(4,Types.FLOAT);
		//execute the procedure the output will be stored in registered parameter
		callableStatement.executeUpdate();
		//Get the output
		System.out.println(callableStatement.getInt(2));
		System.out.println(callableStatement.getString(3));
		System.out.println(callableStatement.getFloat(4));
		
		connection.close();
	}

}
