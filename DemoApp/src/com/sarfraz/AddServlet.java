package com.sarfraz;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
//	the service is a inbuilt thing there doGet, doPost which we can use so based on the form request
//	only those will work
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		
//		in console 
//		System.out.println("the result is " + k);
		
//		PrintWriter out = res.getWriter();
//				
//		out.print("the result is " + k);
		
//		to call the SqServlet we can use two methods 
//		1) Req Dispatcher
//		2) redirect
		
//		#################Reqest Dispatcher##############
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
		
//		#################Request Redirect#######################
//		res.sendRedirect("square?k="+k);
		
//		#################session##############
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
//		################cookies###############
		Cookie cookie = new Cookie("k", k + ""); // k + '' - this converts to string
		res.addCookie(cookie);
		res.sendRedirect("square");	
	}
}
