package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController { 

    private UserService userService;

    @Autowired
    public UserController (UserService userService){
        this.userService = userService;
    }
    
    @GetMapping("/user")
    public User getUser(@RequestParam String id){
        User user = userService.getUser(id);

        if (user!=null){
            return user;
        }
        return user;

    }
}
