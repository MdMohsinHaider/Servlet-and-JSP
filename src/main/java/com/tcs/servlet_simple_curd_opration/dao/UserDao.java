package com.tcs.servlet_simple_curd_opration.dao;

import com.tcs.servlet_simple_curd_opration.connection.MyDbConnection;
import com.tcs.servlet_simple_curd_opration.dto.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class UserDao {

    Connection connection = new MyDbConnection().getConnection();

    // insert user
    public int saveUserDao(User user){
        try {
            CallableStatement callableStatement = connection.prepareCall("call saveUser(?,?,?,?,?)");
            callableStatement.setString(1,user.getUser_id());
            callableStatement.setString(2,user.getUser_name());
            callableStatement.setString(3,user.getUser_email());
            callableStatement.setObject(4,user.getUser_dob());
            callableStatement.setString(5,user.getUser_gender());

            // return integer if insert any data then return > 0
            return callableStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return 0;
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    // delete user by Id.
    public int deleteUserDao(String userId){
        try {
            CallableStatement callableStatement = connection.prepareCall("call ---");
            callableStatement.setString(1,userId);
            return callableStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return 0;
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    // Update user By id.
    public int updateUserDao(String userId, User user){
        try {
            CallableStatement callableStatement = connection.prepareCall("call ------");
            callableStatement.setString(1,userId);
            callableStatement.setString(2,user.getUser_name());
            callableStatement.setString(3,user.getUser_email());
            callableStatement.setObject(4,user.getUser_dob());
            callableStatement.setString(5,user.getUser_gender());

            return callableStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    // Read All user from DB.
    public List<User> readAllUserDao(){
        try {
            CallableStatement callableStatement = connection.prepareCall("call -------");
            ResultSet resultSet = callableStatement.executeQuery();
            List<User> userList = new Vector<>();
            while (resultSet.next()){
                String u_id = resultSet.getString("userId");
                String u_name = resultSet.getString("userName");
                String u_email = resultSet.getString("userEmail");
                String u_gender = resultSet.getString("userGender");
                LocalDate u_dob = resultSet.getDate("userDateOfBirth").toLocalDate();
                User user = new User(u_id,u_name,u_email,u_gender,u_dob);
                userList.add(user);
            }
            return userList;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return Collections.singletonList(new User("user null value..! data not found"));
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    // Read User by id.
    public User readUserByIdDao(String userId){
        try {
            CallableStatement callableStatement = connection.prepareCall("call ");
            callableStatement.setString(1,userId);
            ResultSet resultSet = callableStatement.executeQuery();
            User user= null;
            if (resultSet.next()){
                String u_name = resultSet.getString("userName");
                String u_email = resultSet.getString("userEmail");
                String u_gender = resultSet.getString("userGender");
                LocalDate u_dob = resultSet.getDate("userDateOfBirth").toLocalDate();
                user = new User(u_name,u_email,u_gender,u_dob);
            }
            return user;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return new User("user null value..! data not found");
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
