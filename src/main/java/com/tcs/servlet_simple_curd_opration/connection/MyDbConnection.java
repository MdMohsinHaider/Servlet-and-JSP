package com.tcs.servlet_simple_curd_opration.connection;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnection {

    public Connection getConnection(){
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/","","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
