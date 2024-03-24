package com.sathya.cookiesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		Cookie[] cookies=request.getCookies();
		
		writer.println("<html>");
		writer.println("<body bgcolor='lightgreen' >");
		writer.println("<pre>");
		writer.println("Username..: "+cookies[0].getValue()+"<br><br>");
		writer.println("Age...: "+cookies[1].getValue()+"<br><br>");
		writer.println("Qualification...: "+cookies[2].getValue()+"<br><br>");
		writer.println("Designation....: "+cookies[3].getValue()+"<br><br>");
		writer.println("User Email: "+request.getParameter("email")+"<br><br>");
		writer.println("User Mobile: "+request.getParameter("mobile")+"<br><br>");
		
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
		
		
	}

}
