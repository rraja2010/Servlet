package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Servlet1() {
		System.out.println("Servlet1()-Constructor");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text");
		PrintWriter out = response.getWriter();
		
		System.out.println("Welcome Servlet1");
			   out.println();
		       out.println("Welcome Servlet1");
	}
}
