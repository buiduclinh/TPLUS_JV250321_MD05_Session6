package com.example.bai12345678.dao;

import com.example.bai12345678.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDAO {
    List<User> getAllUsers();
    boolean addUser(User user);
}
