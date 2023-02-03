package com.example.demo.Models;

import java.util.ArrayList;

public class User {

    private String password;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Alert> listOfAlerts = new ArrayList<>();

    public User(String userName,
            String firstName,
            String lastName,
            String password,
            String email){

        this.password = password;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

//GETTERS
    public String getPassword(){
        return password;
    }

    public String getUserName(){
        return userName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public ArrayList<Alert> getAlerts(){
        return listOfAlerts;
    }

//SETTERS   
    public void setPassword(){
        this.password = password;
    }

    public void setUserName(){
        this.userName = userName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public void setEmail(){
        this.email = email;
    }

    public void addAlerts(Alert alert){
        listOfAlerts.add(alert);
    }
    
}
