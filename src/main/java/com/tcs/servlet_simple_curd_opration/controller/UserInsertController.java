package com.tcs.servlet_simple_curd_opration.controller;

import jakarta.servlet.*;

import java.io.IOException;

public class UserInsertController implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method");
        String id = req.getParameter("userId");
        String email = req.getParameter("userEmail");
        String name = req.getParameter("userName");
        String gender = req.getParameter("gender");
        String dob = req.getParameter("userDob");

        // print the data
        System.out.println("id : "+id+"\nEmail : "+email+"\nName : "+name+"\nGender : "+gender+"\nDate of Birth : "+dob);
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
