package com;

import jakarta.servlet.ServletException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.LoginData;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		
		//out.println(email+" "+pass);
		
		
		LoginData data = new LoginData();
		
		
		
		
		if(data.check(name,email)){
			
//			HttpSession session = request.getSession();
//			
//			session.setAttribute("username", uname);
		//	out.println("User Logged In Successfully");
			
			response.sendRedirect("SearchFlight.jsp");
			
			
		}
		else{
			
			out.println("User Not Logged In");
			
		}
		 
		 
		
		
	}
	
}
