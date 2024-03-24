package com.sathya.cookiesession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Firstservlet")
public class Firstservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		            // get the client data
		
					String username=request.getParameter("username");
					String age=request.getParameter("age");
					 
					//create the Cookies Objects
					Cookie cookie1=new Cookie("username",username);
					Cookie cookie2=new Cookie("age",age);
					
					//add  the data
					response.addCookie(cookie1);
					response.addCookie(cookie2);
					
					
					//request the dispatcher
					
					RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
					
					dispatcher.forward(request, response);
	}

}
