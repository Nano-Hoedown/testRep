package com.example.controller;

import com.example.dao.iUserDao;
import com.example.entity.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private iUserDao userDao;
    @GetMapping("/queryUser")
    public List<users> queryAll(){
        return userDao.queryUsers();
    }

}
