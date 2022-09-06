package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet41 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s1 = request.getQueryString();

		String[] s2 = s1.split("&");

		String name, value;

		System.out.println(Arrays.toString(s2));
		out.println(Arrays.toString(s2));

		for (String s3 : s2) {
			name = s3.substring(0, s3.indexOf("="));
			value = s3.substring(s3.indexOf("=") + 1, s3.length());
			// s3= param1=amit;
			// 012345678901
			// param1=name, amit is value

			out.println(name + ":" + value + "<br>");
			System.out.println(name + ":" + value);

		}

	}
}
