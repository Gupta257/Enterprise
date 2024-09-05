package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.klu.entity.Facultylogin;
import com.klu.entity.Login;
import com.klu.repository.FacultyloginRepository;


@Service
public class FacultyloginManager {

    @Autowired
    FacultyloginRepository LR;

    public String validateLogin(Facultylogin L) {
        Facultylogin log = LR.findById(L.getName()).orElse(null);

        if (log != null && log.getPassword().equals(L.getPassword())) {
            return "Login successful";
        } else {
            return "Incorrect username or password";
        }
    }
}
