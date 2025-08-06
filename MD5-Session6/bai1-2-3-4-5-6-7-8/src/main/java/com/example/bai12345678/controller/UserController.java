package com.example.bai12345678.controller;

import com.example.bai12345678.dao.UserDAO;
import com.example.bai12345678.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @GetMapping
    public String listUsers(Model model) {
        List<User> users = userDAO.getAllUsers();
        model.addAttribute("users", users);
        return "UserList";
    }

    @PostMapping
    public String addUser(@ModelAttribute @Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("users", userDAO.getAllUsers()); // nếu cần quay lại danh sách
            return "UserForm"; // Trả về lại form nếu có lỗi
        }

        userDAO.addUser(user);
        return "redirect:/users";
    }
}
