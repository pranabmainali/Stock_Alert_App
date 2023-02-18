package com.backend.stockalertbackend.model;

public class Alert {
    private Stock stock;
    private double targetPrice;
    private Condition condition;

    public Alert(Stock stock, double target_price, Condition condition){
        this.condition = condition;
        this.stock = stock;
        this.targetPrice = target_price;
    }
    
    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
