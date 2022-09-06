package com.lara;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class GenericServlet implements Servlet, ServletConfig, Serializable {

	private static final long serialVersionUID = 1L;
	private transient ServletConfig config;

	public GenericServlet() {
	}

	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		init();
	}

	public void init() throws ServletException {

	}

	public abstract void service(ServletRequest servletrequest, ServletResponse servletresponse)
			throws ServletException, IOException;

	public void destroy() {
	}

	public String getServletInfo() {
		return "";
	}

	public ServletConfig getServletConfig() {
		return config;
	}
	/* -------ServletConfig----------------- */

	public String getInitParameter(String name) {
		return getServletConfig().getInitParameter(name);
	}

	public Enumeration getInitParameterNames() {
		return getServletConfig().getInitParameterNames();
	}

	public ServletContext getServletContext() {
		return getServletConfig().getServletContext();
	}

	public String getServletName() {
		return config.getServletName();
	}

}
