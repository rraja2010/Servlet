package com.lara;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface Servlet
{
	public abstract void init(ServletConfig servletconfig)
			throws ServletException;

	public abstract void service(ServletRequest servletrequest,
			ServletResponse servletresponse) throws ServletException,
			IOException;

	public abstract void destroy();
	
	public abstract ServletConfig getServletConfig();
	public abstract String getServletInfo();
}
