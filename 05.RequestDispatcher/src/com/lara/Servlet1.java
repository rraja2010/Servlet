package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		System.out.println("servlet1-begin-sop");
		out.println("servlet1-begin-out</br>");

		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");

		String revParam1 = new StringBuffer(s1).reverse().toString();
		String revParam2 = new StringBuffer(s2).reverse().toString();

		request.setAttribute("result1", revParam1);
		request.setAttribute("result2", revParam2);

		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");

		rd.forward(request, response);
		//rd.include(request, response);

		System.out.println("Servlet1-end-sop");
		out.println("Servlet1-end-out</br>");
	}
}
