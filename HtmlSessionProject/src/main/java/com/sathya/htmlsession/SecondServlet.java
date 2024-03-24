package com.sathya.htmlsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Qualification=request.getParameter("qualification");
		String Designation=request.getParameter("designation");
		 
		//locate the session
		HttpSession session=request.getSession(false);
		 
		//place the data
		session.setAttribute("qualification", Qualification);
		session.setAttribute("designation", Designation);
		
		//request the dispatcher
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");
		
		dispatcher.forward(request, response);

	}

}
