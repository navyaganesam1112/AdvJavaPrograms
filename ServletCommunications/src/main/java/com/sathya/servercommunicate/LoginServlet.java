package com.sathya.servercommunicate;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1 : Read the form data
    	String username=request.getParameter("username");
    	String password=request.getParameter("password" );
    	
    	//Request Dispatcher code
    	/*if(username.equals("Navya")&&password.equals("Navya@123")) {
    	   RequestDispatcher dispatcher =request.getRequestDispatcher("success.html");
    	   dispatcher.forward(request, response);
    	}
    	else {
    		 response.setContentType("text/html");
    		 PrintWriter writer=response.getWriter();
        	 writer.println("Login Fail check the credentials once...");
        	 RequestDispatcher dispatcher =request.getRequestDispatcher("login.html");
      	      dispatcher.include(request, response);
    	}*/
    	
    	//Send Redirect code
    	
    	/*if(username.equals("Navya")&&password.equals("Navya@123")) {
    		response.sendRedirect("http://www.tcs.com");
    	}
    	else {
    		response.sendError(808,"Login Fail check the details");
    	}*/
    	
    	
    	//HyperLink Code
    	
    	 response.setContentType("text/html");
		 PrintWriter writer=response.getWriter();
		 if(username.equals("Navya")&&password.equals("Navya@123")) {
			 writer.println("Login Successful <br>");
			 writer.println("<a href ='http://www.sathyatech.com'> Click here to open the sathya website</a>");
		 }
		 else {
			 writer.println("Login Fail <br>");
			 writer.println("<a href='login.html'>Click here to Login Page</a>");
		 }
    	
    	
    	
    	
    	
	}

}
