package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.User;
import com.klu.model.UserManager;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
     UserManager userManager;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return userManager.registerUser(user);
    }
}