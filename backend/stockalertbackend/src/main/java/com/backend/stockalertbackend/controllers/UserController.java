package com.backend.stockalertbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.stockalertbackend.model.User;

@RestController
public class UserController {

    private User user = new User("pmainali", "hello");

    @GetMapping("/getUser")
    public User getUser(long userid){
        return user;
    }
    
}
