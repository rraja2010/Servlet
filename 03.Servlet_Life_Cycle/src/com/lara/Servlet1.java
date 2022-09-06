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
		System.out.println("Servlet()- CONSTRCUTOR");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init()");
		// destroy();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("service()");
		System.out.println("service()");
	}

	@Override
	public void destroy() {
		System.out.println("detroy()");
	}

}
