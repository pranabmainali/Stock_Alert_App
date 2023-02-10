package com.backend.stockalertbackend.model;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class User {
    
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
}

