package com.tcs.servlet_simple_curd_opration.controller;

import com.tcs.servlet_simple_curd_opration.service.UserService;
import jakarta.servlet.*;

import java.io.IOException;

public class UserReadAllController implements Servlet {

    UserService service = new UserService();

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
        System.out.println("Service method from Read Servlet");
    }

    @Override
    public String getServletInfo() {
        return "This is user insert Servlet, created by Author : Md Mohsin Haider";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet Destroy");
    }
}
