package com.sarfraz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k = 0;
//		############cookies###############
		Cookie cookie[] = req.getCookies();
		for(Cookie c : cookie) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
//		############session################
//		HttpSession session = req.getSession();
//		session.removeAttribute("k");
//		int k = (int) session.getAttribute("k");
//		int k = Integer.parseInt(req.getParameter("k"));
		
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("the Square is " + k);
		
		System.out.println("sq called");
	}
}
