package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.entity.User;
import com.klu.repository.UserRepository;

@Service
public class UserManager {

    @Autowired
     UserRepository userRepository;

    public String registerUser(User user) {
        userRepository.save(user);
        return "User registered successfully";
    }
}