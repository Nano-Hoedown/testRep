package org.wrz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.wrz.dao.iUserDao;
import org.wrz.entity.user;
import org.wrz.service.iUserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private iUserService userService;

    @GetMapping("queryAll")
    public String queryAll(ModelMap map){
        List<user> users = userService.queryList();
        map.put("users",users);
        return "index";
    }
}
