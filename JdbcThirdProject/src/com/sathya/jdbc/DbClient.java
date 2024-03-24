package com.sathya.jdbc;

import java.sql.SQLException;
import java.util.List;

public class DbClient {

	public static void main(String[] args) throws SQLException {
		ProductDao  productDao=new ProductDao();
//		 int res1=productDao.createProductTable();
//		  System.out.println("Table created successfully.."+res1);
//			
//	
	
//	     int res1=productDao.saveProduct(new Product(103,"Sugar",350));
//		System.out.println("Data Inserted succesfully...."+res1);
//		
//		int res2=productDao.saveProduct(new Product(105,"Jaggery",600));
//				System.out.println("Data Inserted succesfully...."+res2);
//				
//		int res3=productDao.saveProduct(new Product(107,"Rice",1200));
//		System.out.println("Data Inserted succesfully...."+res3);
//		
//		int res4=productDao.saveProduct(new Product(108,"Pulses",800));
//		System.out.println("Data Inserted succesfully...."+res4);
//		
//	  Product pro =productDao.getProductById(103);
//	  System.out.println(pro);
		
//	  List<Product> p=productDao.getAllProducts();	
//	  p.forEach(pro->System.out.println(pro));

//		int count=productDao.updateByPrice(800,50);
//		System.out.println("Data Updated successfully...."+count);	
	
//		int count =productDao.deleteById(105);
//		System.out.println("data deleted successfully....."+count);

//		int count=productDao.deleteByPrice(350);
//		System.out.println("data deleted successfully..."+count);
		
		int res=productDao.dropTable();
		System.out.println("Table dropped successfully.."+res);
		
		
		
		
		
}
}