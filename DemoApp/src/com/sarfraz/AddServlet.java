package com.sarfraz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

public class AddServlet extends HttpServlet
{
//	the service is a inbuilt thing there doGet, doPost which we can use so based on the form request
//	only those will work
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		k=k*k;
//		in console 
//		System.out.println("the result is " + k);
		
//		PrintWriter out = res.getWriter();
//				
//		out.print("the result is " + k);
		
//		to call the SqServlet we can use two methods 
//		1) Req Dispatcher
//		2) redirect
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
	}
}
