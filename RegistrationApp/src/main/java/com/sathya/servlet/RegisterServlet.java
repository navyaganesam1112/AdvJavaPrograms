package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1:READ the data
		String username=request.getParameter("username");
		String password=request.getParameter("userpassword");
		Long mobile=Long.parseLong(request.getParameter("mobile"));
		
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		
		String []quals=request.getParameterValues("qualification");
		String country=request.getParameter("country");
		
		String [] language=request.getParameterValues("language");
		
		String comments=request.getParameter("comments");
		
		//step-2 Process the data
		  String q=String.join(",",quals);
		  String l=String.join("-", language);
		  
		//step-3 Render the response
		  response.setContentType("text/html");
		  PrintWriter writer =response.getWriter();
		  writer.println("<html>");
		  writer.println("<body bgcolor=skyblue>");
		  writer.println("Username: "+username+"<br><br>");
		  writer.println("Password: "+password+"<br><br>");
		  writer.println("Email: "+email+"<br><br>");
		  writer.println("Gender: "+gender+"<br><br>");
		  writer.println("Dob :"+dob+"<br><br>");
		  writer.println("Qualification: "+q+"<br><br>" );
		  writer.println("Langusges :"+l+"<br><br>" );
		  writer.println("Comments"+comments+"<br><br>" );
		  writer.println("</body>");
		  writer.println("</html>");
		  
		 
		  
	}

}
