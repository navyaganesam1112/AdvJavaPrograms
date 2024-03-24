package com.satya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1 : Read the form data
    	String firstname=request.getParameter("firstname");
    	String middlename=request.getParameter("middlename" );
    	String lastname=request.getParameter("lastname" );
    	
    	//step-2:Process the data
    	String status;
    	if(firstname.equals("Navya")&&middlename.equals("Ganesam")&&lastname.equals("Reddy")) {
    		status=firstname+" "+middlename+" "+lastname;
    		}
    	else {
    		status="Login Fail...";
    		
    	}
    	//step-3 :Render the response to client
   	 PrintWriter writer=response.getWriter();
   	 response.setContentType("text/html");
   	 writer.println("<html>");
   	 writer.println("<h1>Your FullName.....</h1>"+status);
   	 writer.println("</html>");
	}

}
