package com.example.bai12345678.bussiness;

import com.example.bai12345678.model.User;

import java.util.List;

public interface UserIServ {
    List<User> getAllUsers();
    boolean addUser(User user);
}
