package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1:Read the Requested data
		int num1=Integer.parseInt(request.getParameter("first"));
		int num2=Integer.parseInt(request.getParameter("second"));
		String operation=request.getParameter("operation");
		
		//step-2:Process the data
		 int result=0;
		 switch(operation)
		 {
		   case "+":result=num1+num2;
		           break;
		   case "-":result=num1-num2;
                    break; 
		   case "*":result=num1*num2;
                    break; 
		   case "/":result=num1/num2;
                    break; 
		   case "%":result=num1%num2;
                    break; 
		 }
		 
		//step-3:Render the Response to client
	      
	        response.setContentType("text/html");
		     PrintWriter writer=response.getWriter();	    
		     writer.println("<html>");
		     writer.println("<body bgcolor=skyblue>");
		     writer.println("<h1>Your Result here....</h1>");
		     writer.println("First Number= "+ num1+"<br><br>");
		     writer.println("Second Number= "+ num2+"<br><br>");
		     writer.println("Operator symbol= "+ operation+"<br><br>");
		     writer.println("Result = "+result+"<br><br>");
		     writer.println("</body>");
		     writer.println("</html>");
	      
	      
		 
		
	}

}
