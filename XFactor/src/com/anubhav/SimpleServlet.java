package com.anubhav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head></head><body><h1>Welcome To First Servlet</h1></body></html>");
		String uname=getInitParameter("userName");
		String company=getInitParameter("Company");
		//ServletConfig config=getServletConfig();
		//String uname=config.getInitParameter("userName");
		//String company=config.getInitParameter("Company");
		out.println("<hr>");
		out.println("<b>Welcome " +uname+ " You are from "+company);
		out.println("<hr>");
		ServletContext context=getServletContext();
		String country=context.getInitParameter("country");
		String city=context.getInitParameter("city");
		out.println("Country : "+country+ "<br>City : "+city);
		
		
	}
	

}
