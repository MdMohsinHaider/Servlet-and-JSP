package com.tcs.servlet_simple_curd_opration.controller;

import jakarta.servlet.*;

import java.io.IOException;

public class UserUpdateController implements Servlet {
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
        String email = req.getParameter("userEmail");
        String name = req.getParameter("userName");
        String gender = req.getParameter("gender");
        String dob = req.getParameter("userDob");

        // print the data coming from jsp file
        System.out.println("id : "+id+"\nEmail : "+email+"\nName : "+name+"\nGender : "+gender+"\nDate of Birth : "+dob);
    }

    @Override
    public String getServletInfo() {
        return "This is user update Servlet, created by Author : Md Mohsin Haider";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet Destroy");
    }
}
