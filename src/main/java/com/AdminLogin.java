package com;

import jakarta.servlet.ServletException;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AdminLoginData;
import com.LoginData;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	
public static boolean isLoggedIn = false;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		//out.println(email+" "+pass);
		
		
		AdminLoginData logindata = new AdminLoginData();
		
		
		
		
		if(logindata.check(email,pass)){
			
//			HttpSession session = request.getSession();
//			
//			session.setAttribute("username", uname);
		//	out.println("User Logged In Successfully");
			
			   isLoggedIn = true;
	            out.println("You have LoggedIn");
	            response.sendRedirect("AdminDashboard.jsp");
			
		}
		else{
			    isLoggedIn = false;
	            out.println("Login Failed : Incorrect email or Password");
	            
	            

		}
		 
		 
		
		
	}
	


	

}
