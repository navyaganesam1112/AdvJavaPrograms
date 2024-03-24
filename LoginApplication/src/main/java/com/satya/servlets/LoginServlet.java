package com.satya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	

    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1 : Read the form data
    	String username=request.getParameter("username");
    	String password=request.getParameter("password" );
    	
    	//step-2:Process the data
    	String status;
    	if(username.equals("Navya")&&password.equals("Navya@123")) {
    		status="Login Successful...";
    		}
    	else {
    		status="Login Fail...";
    		
    	}
    	//step-3 :Render the response to client
    	 PrintWriter writer=response.getWriter();
    	 response.setContentType("text/html");
    	 writer.println("<html>");
    	 writer.println("<h1>Login Status.....</h1>"+status);
    	 writer.println("</html>");
    	 
    		
    	
	}

	
	
}
