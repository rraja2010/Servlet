package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Raja extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("Raja starts");
		String name = request.getParameter("name");
		String reverse = (String) request.getAttribute("reverse");

		out.println("name=" + name);
		out.println("reverse=" + reverse);
		out.println("Raja end");
	}
}
