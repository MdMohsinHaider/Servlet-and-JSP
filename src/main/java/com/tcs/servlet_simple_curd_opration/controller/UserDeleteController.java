package com.tcs.servlet_simple_curd_opration.controller;

import com.tcs.servlet_simple_curd_opration.service.UserService;
import jakarta.servlet.*;

import java.io.IOException;

public class UserDeleteController implements Servlet {

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
        System.out.println("Service method");
        String id = req.getParameter("userId");
        int a = service.deleteUserService(id);

        System.out.println("Response is : "+a);
        RequestDispatcher dispatcher;
        if (a>0){
            dispatcher = req.getRequestDispatcher("success.jsp");
        }
        else {
            dispatcher = req.getRequestDispatcher("warning.jsp");
        }
        dispatcher.forward(req, res);

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
