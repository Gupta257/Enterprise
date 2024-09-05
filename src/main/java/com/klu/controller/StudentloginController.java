package com.klu.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.klu.entity.Studentlogin;

import com.klu.model.StudentloginManager;

@RestController
@RequestMapping("/studentlogin")
public class StudentloginController {

    @Autowired
    StudentloginManager M;

    @PostMapping("/studentvalidate")
    public String validateLogin(@RequestBody Studentlogin L) {
        return M.validateLogin(L);
    }
}
