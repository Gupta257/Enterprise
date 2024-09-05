package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.Facultylogin;
import com.klu.entity.Login;
import com.klu.model.FacultyloginManager;
import com.klu.model.LoginManager;

@RestController
@RequestMapping("/facultylogin")
public class FacultyloginController {

    @Autowired
    FacultyloginManager M;

    @PostMapping("/facultyvalidate")
    public String validateLogin(@RequestBody Facultylogin L) {
        return M.validateLogin(L);
    }
}
