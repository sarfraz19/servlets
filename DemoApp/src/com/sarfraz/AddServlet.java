package com.sarfraz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
//	the service is a inbuilt thing there doGet, doPost which we can use so based on the form request
//	only those will work
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
//		in console 
//		System.out.println("the result is " + k);
		
		PrintWriter out = res.getWriter();
				
		out.print("the result is " + k);
		

	}
}
