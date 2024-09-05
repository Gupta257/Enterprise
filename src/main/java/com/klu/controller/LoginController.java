package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.Login;
import com.klu.model.LoginManager;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginManager M;

    @PostMapping("/validate")
    public String validateLogin(@RequestBody Login L) {
        return M.validateLogin(L);
    }
}
