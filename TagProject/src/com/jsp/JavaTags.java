package com.jsp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class JavaTags extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		out.println("<h2 style='color:red;font-style:italic'>Hello World</h2>");
	}
	
	

}
