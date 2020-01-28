package com.sarfraz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Hi<br />");
		
//		#############servlet context############
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str);
		out.println();
		
//		#############servlet config############# this puts init param in xml
		ServletConfig cg = getServletConfig();
		String str2 = cg.getInitParameter("name");
		out.println(str2);
		}
}
