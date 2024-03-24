package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

	

	public int createProductTable() throws SQLException {
		 Connection connection=null;
		  Statement statement=null;
		  int count=0;
		  try {
			  //Get the connection
			  connection =DbConnection.createconnection();
			  
			  //create the Ps Object
			  statement =connection.createStatement();
			  String q1="Create table Product(proid number,proName varchar2(20),proPrice number)";
			  count=statement.executeUpdate(q1);
			  }
		  catch(SQLException e) {
			  e.printStackTrace();
			  
		  }
		  finally {
			  //before release connection check the connection present or not
			  if(statement!=null)
				  statement.close();
			  if(connection!=null)
				  connection.close();
		  }
		return count;
	  }

	public int saveProduct(Product pro) throws SQLException {
		 Connection connection=null;
		  PreparedStatement preparedStatement=null;
		  int count=0;
		  try {
			  //Get the connection
			  connection =DbConnection.createconnection();
			  
			  //create the Ps Object
			  preparedStatement =connection.prepareStatement("insert into Product values(?,?,?)");
			  
			  //read the data from emp object and set to parameters
			  preparedStatement.setInt(1,pro.getProId());
			  preparedStatement.setString(2,pro.getProName());
			  preparedStatement.setDouble(3,pro.getProPrice());
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

	public Product getProductById(int proId) {
		
		  Product product=null;
			
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("select * from product where proId=?"))
			{
				
				preparedStatement.setInt(1,proId);
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next())
				{
					product  =new Product();
					product.setProId(resultSet.getInt(1));
					product.setProName(resultSet.getString(2));
					product.setProPrice(resultSet.getDouble(3));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
				}
			return product;
			}
		
	

	public List<Product> getAllProducts() {
		
		// Create the list to store group of records
	    List<Product> p=new ArrayList<Product>();
	    try(Connection connection =DbConnection.createconnection();
	    	Statement statement =connection.createStatement();	){
	    	//excecute the query to store the resultset                                                                                
	    	ResultSet resultSet=statement.executeQuery("select * from emp");
	    	while(resultSet.next()) {
	    		Product pro=new Product();
	    		pro.setProId(resultSet.getInt(1));
	    		pro.setProName(resultSet.getString(2));
	    		pro.setProPrice(resultSet.getDouble(3));
	    		p.add(pro);
	    	
	    	
	    	}
	    }
	    	catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    	
	    
	    return p;
	    }

	public int updateByPrice(double priceRange,double IncrementValue) {
		int count=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("update Product set proPrice=proPrice+? where proPrice>?"))
		{
			preparedStatement.setDouble(1,IncrementValue);
			preparedStatement.setDouble(2,priceRange);
			count=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public int  deleteById(int proId) {
		int count=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from Product where proId=?"))
		{
			preparedStatement.setInt(1,proId);
			
			count=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	
		
	}

	public int deleteByPrice(int proPrice) {
		int count=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from Product where proPrice=?"))
		{
			preparedStatement.setInt(1,proPrice);
			
			count=preparedStatement.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public int dropTable() throws SQLException {
		int count=0;
		 try(Connection connection =DbConnection.createconnection();
			    	Statement statement =connection.createStatement();	){
			 String q1="Drop table Product";
			  count=statement.executeUpdate(q1);
			  }
		  catch(SQLException e) {
			  e.printStackTrace();
			  
		  }
			 
		 
		return count;
	}
		

}


