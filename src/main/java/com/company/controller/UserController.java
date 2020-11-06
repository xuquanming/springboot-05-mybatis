package com.company.controller;


import com.company.mapper.UserMapper;
import com.company.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryList(){
        List<User> users = userMapper.queryList();
        return users;
    }

    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(111,"single","dd"));
        return "add Ok";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(111,"single","dd"));
        return "update Ok";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(111);
        return "delete Ok";
    }
}
