package com.tcs.servlet_simple_curd_opration.controller;

import com.tcs.servlet_simple_curd_opration.dto.User;
import com.tcs.servlet_simple_curd_opration.service.UserService;
import jakarta.servlet.*;

import java.io.IOException;
import java.time.LocalDate;

public class UserInsertController implements Servlet {

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
            String email = req.getParameter("userEmail");
            String password = req.getParameter("userPassword");
            String name = req.getParameter("userName");
            String gender = req.getParameter("gender");
            String dob = req.getParameter("userDob");

            User user = new User(id,name,email,password,gender, LocalDate.parse(dob));
            int a = service.saveUserService(user);
            System.out.println("Response is : "+a);
            if (a>0){
                RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
                dispatcher.forward(req, res);
            }
            else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("warning.jsp");
                dispatcher.forward(req, res);
            }

            // print the data coming from jsp file in console
            System.out.println("id : "+id+"\nEmail : "+email+"\nName : "+name+"\nGender : "+gender+"\nDate of Birth : "+dob);
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
