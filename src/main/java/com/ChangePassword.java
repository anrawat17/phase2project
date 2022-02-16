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

@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
		       ChangePasswordAdminData data = new ChangePasswordAdminData();
		       
		       
		       PrintWriter out = response.getWriter();
		       
		       
		       String pass = request.getParameter("passwordEntered");
		       
		       
		       if (!AdminLogin.isLoggedIn){
		            out.println("You must login first");
		        }
		        else if (pass.equals("")){
		            out.println("Password can't be empty");
		        }
		        else if (AdminLogin.isLoggedIn && !pass.equals("")){
		             if(data.check(pass)){
		            	 out.println("Password changed. New Password is "+pass);
		            	 response.setContentType("text/html");
		            	 out.println();
		            	 
		            	 out.println("<a href=\"AdminLogin.jsp\">Admin Login</a>");
		             }
		            
		        }
		        else {
		            out.println("Sorry, Something went wrong");
		        }
		
		
		
	}

}

