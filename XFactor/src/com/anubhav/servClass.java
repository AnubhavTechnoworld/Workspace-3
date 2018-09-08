package com.anubhav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servClass extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String uname = getInitParameter("userName");
		String company=getInitParameter("Company");
		out.println("Welcome "+uname+" You are from " +company);
		out.println("<hr>");
		ServletContext context=getServletContext();
		String country=context.getInitParameter("country");
		String city=context.getInitParameter("city");
		out.println("Country : "+country+ "<br>City : "+city);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
	
	

}
