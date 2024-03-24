package com.sathyatech.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/navs")
public class HelloWorldServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer =response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Welcome to SatyaTech</h1> ");
		writer.println("<h2>Welcome to Servlet First Application</h2>");
		writer.println("<h3>Welcome to Advance Java<h3>");
		writer.println("</html>");
	}

}
