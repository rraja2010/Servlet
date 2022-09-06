package com.lara;

import java.util.Enumeration;

import javax.servlet.ServletContext;

public interface ServletConfig
{
	public abstract String getServletName();

    public abstract ServletContext getServletContext();

    public abstract String getInitParameter(String s);

    public abstract Enumeration getInitParameterNames();
}
