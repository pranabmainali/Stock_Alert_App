package com.backend.stockalertbackend.model;

public class Stock {
    private String ticker;
    
    public Stock(String ticker){
        this.ticker = ticker;
    }

    public String getTicker(){
        return ticker;
    }
    
}