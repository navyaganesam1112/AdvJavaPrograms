package com.sathya.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
  public int save(Employee emp) throws ClassNotFoundException,SQLException {
	  //Declare the resources
	  Connection connection=null;
	  PreparedStatement preparedStatement=null;
	  int count=0;
	  try {
		  //Get the connection
		  connection =DbConnection.createconnection();
		  
		  //create the Ps Object
		  preparedStatement =connection.prepareStatement("insert into emp values(?,?,?)");
		  
		  //read the data from emp object and set to parameters
		  preparedStatement.setInt(1,emp.getEmpId());
		  preparedStatement.setString(2,emp.getEmpName());
		  preparedStatement.setDouble(3,emp.getEmpSalary());
		  count=preparedStatement.executeUpdate();
		   
	  }
	  catch(SQLException e) {
		  e.printStackTrace();
		  
	  }
	  finally {
		  //before release connection check the connection present or not
		  if(preparedStatement!=null)
			  preparedStatement.close();
		  if(connection!=null)
			  connection.close();
	  }
	return count;
  }
public Employee findById(int  empId) throws SQLException
{
	Employee employee=null;
	
	try(Connection connection=DbConnection.createconnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from emp where empId=?"))
	{
		preparedStatement.setInt(1,empId);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
		{
			employee=new Employee();
			employee.setEmpId(resultSet.getInt(1));
			employee.setEmpName(resultSet.getString(2));
			employee.setEmpSalary(resultSet.getDouble(3));
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
		}
	return employee;
	}
	public int deleteById(int empId) {
		int count=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empId=?"))
		{
			preparedStatement.setInt(1,empId);
			
			count=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	public int deleteBySalary(double empSalary) {
		int count1=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empSalary>?"))
		{
			preparedStatement.setDouble(1,empSalary);
			
			count1=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count1;
	}
	
	public List<Employee> findAll(){
		// Create the list to store group of records
	    List<Employee> emps=new ArrayList<Employee>();
	    try(Connection connection =DbConnection.createconnection();
	    	Statement statement =connection.createStatement();	){
	    	//excecute the query to store the resultset                                                                                
	    	ResultSet resultSet=statement.executeQuery("select * from emp");
	    	while(resultSet.next()) {
	    		Employee employee=new Employee();
	    		employee.setEmpId(resultSet.getInt(1));
	    		employee.setEmpName(resultSet.getString(2));
	    		employee.setEmpSalary(resultSet.getDouble(3));
	    		emps.add(employee);
	    	
	    	
	    	}
	    }
	    	catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    	
	    
	    return emps;
	    }
	public int updateSalary(double currentSalary,double incSalary) {
		int updatecount=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("update emp set empSalary=empSalary+? where empSalary>?"))
		{
			preparedStatement.setDouble(1,incSalary);
			preparedStatement.setDouble(2,currentSalary);
			updatecount=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return updatecount;
	}
		
	
	    
	}










































