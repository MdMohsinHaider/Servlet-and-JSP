package com.tcs.servlet_simple_curd_opration.service;

import com.tcs.servlet_simple_curd_opration.dao.UserDao;
import com.tcs.servlet_simple_curd_opration.dto.User;

import java.util.List;

public class UserService {
    UserDao dao = new UserDao();

    // Insert user
    public int saveUserService(User user){
        if (user == null){
            return 0;
        }
        String u_id = user.getUser_id();
        String u_name = user.getUser_name();
        return dao.saveUserDao(user);
    }

    // delete user by Id.
    public int deleteUserService(String userId){
        if (userId.isEmpty()){
            return 0;
        }
        return dao.deleteUserDao(userId);
    }

    // Update user By id.
    public int updateUserService(String userId, User user){
        if (userId.isEmpty()){
            return 0;
        }
        return dao.updateUserDao(userId,user);
    }

    // Read All user from DB.
    public List<User> readAllUserService(){
        return dao.readAllUserDao();
    }

    // Read User by id.
    public User readUserByIdDao(String userId){
        return dao.readUserByIdDao(userId);
    }
}
