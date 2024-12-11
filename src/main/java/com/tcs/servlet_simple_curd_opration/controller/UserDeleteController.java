package com.tcs.servlet_simple_curd_opration.controller;

import jakarta.servlet.*;

import java.io.IOException;

public class UserDeleteController implements Servlet {

    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
        System.out.println("Initialized Servlet");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method");
        String id = req.getParameter("userId");

        System.out.println(id);
    }

    @Override
    public String getServletInfo() {
        return "This is user delete Servlet, created by Author : Md Mohsin Haider";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet Destroy");
    }
}
