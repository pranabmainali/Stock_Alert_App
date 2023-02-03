package com.example.demo.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.Models.User;

@Service
public class UserService {

    private ArrayList<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User("pmainali", "pranab", "mainali", "hello", "drew.pranab7@gmail.com");
        User user2 = new User("phub", "phub", "hub", "hello", "phub7@gmail.com");

        userList.add(user1);
        userList.add(user2);
    }
    

    public User getUser(String id){

        for (User user : userList){
            if (user.getUserName().equals(id)){
                return user;
            }
        }
        return null;

    }
}
