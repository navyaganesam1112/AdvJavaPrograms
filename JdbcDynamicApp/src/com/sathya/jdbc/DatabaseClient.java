package com.sathya.jdbc;

import java.sql.SQLException;
import java.util.List;

public class DatabaseClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDao employeeDao=new EmployeeDao();
//		int res1=employeeDao.save(new Employee(1024,"kiran",35000));
//		System.out.println("Data Inserted succesfully...."+res1);
//		
//		int res2=employeeDao.save(new Employee(1054,"Dinesh",25000));
//		System.out.println("Data Inserted succesfully...."+res2);
//		
//		Employee emp=employeeDao.findById(1001);
//		System.out.println(emp);
//		
//		int count=employeeDao.deleteById(1023);
//		if(count==1)
//			System.out.println("data deleted successfully");
//		else
//			System.out.println("data delete failed");
//		
//	    int count1=employeeDao.deleteBySalary(1200);
//		System.out.println("Number of records deleted successfully..."+count1);
		
//		List<Employee> emps=employeeDao.findAll();
//		emps.forEach(emp->System.out.println(emp));
		
		int count=employeeDao.updateSalary(25000,1000);
		System.out.println("data updated successfully..."+count);
	}

}








































