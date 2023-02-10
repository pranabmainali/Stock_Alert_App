package com.backend.stockalertbackend.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class User {
    
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

