package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.klu.entity.Studentlogin;

import com.klu.repository.StudentloginRepository;


@Service
public class StudentloginManager {

    @Autowired
    StudentloginRepository LR;

    public String validateLogin(Studentlogin L) {
        Studentlogin log = LR.findById(L.getName()).orElse(null);

        if (log != null && log.getPassword().equals(L.getPassword())) {
            return "Login successful";
        } else {
            return "Incorrect username or password";
        }
    }
}
