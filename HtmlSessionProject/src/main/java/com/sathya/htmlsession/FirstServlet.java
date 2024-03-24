package com.sathya.htmlsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			// get the client data
			
			String username=request.getParameter("username");
			int age=Integer.parseInt(request.getParameter("age"));
			 
			//create the session
			HttpSession session=request.getSession();
			 
			//place the data
			session.setAttribute("username", username);
			session.setAttribute("age", age);
			
			//request the dispatcher
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
			
			dispatcher.forward(request, response);
			

	}

}
