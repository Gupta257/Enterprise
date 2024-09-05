package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.klu.entity.Login;
import com.klu.repository.LoginRepository;

@Service
public class LoginManager {

    @Autowired
    LoginRepository LR;

    public String validateLogin(Login L) {
        Login existingLogin = LR.findById(L.getName()).orElse(null);

        if (existingLogin != null && existingLogin.getPassword().equals(L.getPassword())) {
            return "Login successful";
        } else {
            return "Incorrect username or password";
        }
    }
}
