package com.satya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1: Read the requested data
		int proId=Integer.parseInt(request.getParameter("proId"));
		String proName=request.getParameter("proName");
		double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
		
	    //step-2 :Process the data
		 /*(Total Bill <1000 : No discount
		   Total Bill>1000   <5000 :5% Discount
		   Total Bill >5000 <10000 :10% Discount
		   Total Bill >10000       :15% Discount  */
		
		double tot_bill=proPrice*proQuantity;
		double discount,net_amt;
		if(tot_bill<1000)
			  discount=0;
		else if(tot_bill>1000&&tot_bill<5000)
			discount=0.05*tot_bill;
		
		else if(tot_bill>5000&&tot_bill<10000)
			discount=0.1*tot_bill;
		
		else
			discount=0.15*tot_bill;
		
	net_amt=tot_bill-discount;
	
		
		// Step-3 : Render the Response
	     response.setContentType("text/html");
	     PrintWriter writer=response.getWriter();	    
	     writer.println("<html>");
	     writer.println("<body bgcolor=skyblue>");
	     writer.println("<h1>Product Form</h1>");
	     writer.println("Product Id="+proId+"<br><br>");
	     writer.println("Product Name="+proName+"<br><br>");
	     writer.println("Product Price=$"+proPrice+"<br><br>");
	     writer.println("Product Quantity="+proQuantity+"<br><br>");
	     writer.println("Total Bill=$"+tot_bill+"<br><br>"); 
	     writer.println("Discount=$"+discount+"<br><br>");
	     writer.println("Net Amount=$"+net_amt+"<br><br>");
	     writer.println("</body>");
	     writer.println("</html>");
	     
	}

}
