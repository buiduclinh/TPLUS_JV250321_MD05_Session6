package com.example.bai12345678.bussiness.Impl;

import com.example.bai12345678.bussiness.UserIServ;
import com.example.bai12345678.dao.UserDAO;
import com.example.bai12345678.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserIServImpl implements UserIServ {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public boolean addUser(User user) {
        return userDAO.addUser(user);
    }
}
