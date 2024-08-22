package com.user;

import java.io.IOException;
import java.security.PublicKey;

import javax.servlet.RequestDispatcher;

import org.apache.catalina.valves.rewrite.Substitution.StaticElement;

import com.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserSignup extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String nameString=req.getParameter("name");
	String emailString=req.getParameter("email");
	String paString=req.getParameter("password");
	System.out.println(nameString);
	System.out.println(emailString);
	System.out.println(paString);
	  boolean flag=UserDao.userRegistration(nameString, emailString, paString);
	  if(flag) {
		  jakarta.servlet.RequestDispatcher rdDispatcher=req.getRequestDispatcher("login.jsp");
		  rdDispatcher.forward(req, resp);
		}
	  else {
		  jakarta.servlet.RequestDispatcher rdDispatcher=req.getRequestDispatcher("usersignup.jsp");
		  rdDispatcher.forward(req, resp);
				  
	  }
	
	}
}
