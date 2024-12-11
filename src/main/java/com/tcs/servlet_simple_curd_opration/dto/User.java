package com.tcs.servlet_simple_curd_opration.dto;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String user_id;
    private String user_name;
    private String user_email;
    private String user_gender;
    private LocalDate user_dob;

    public User() {
        // default constructor
        super();
    }

    public User(String user_id, String user_name, String user_email) {
        this();
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
    }

    public User(String user_id, String user_name, String user_email, String user_gender) {
        this(user_id,user_name,user_email);
        this.user_gender = user_gender;
    }

    public User(String user_id, String user_name, String user_email, String user_gender, LocalDate user_dob) {
       this(user_id,user_name,user_email,user_gender);
       this.user_dob = user_dob;
    }
    // without id
    public User(String user_name, String user_email, String user_gender, LocalDate user_dob) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_gender = user_gender;
        this.user_dob = user_dob;
    }

    public User(String msg){
        System.err.println(msg);
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public LocalDate getUser_dob() {
        return user_dob;
    }

    public void setUser_dob(LocalDate user_dob) {
        this.user_dob = user_dob;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(user_id, user.user_id) && Objects.equals(user_name, user.user_name) && Objects.equals(user_email, user.user_email) && Objects.equals(user_gender, user.user_gender) && Objects.equals(user_dob, user.user_dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, user_name, user_email, user_gender, user_dob);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_dob=" + user_dob +
                '}';
    }

}
