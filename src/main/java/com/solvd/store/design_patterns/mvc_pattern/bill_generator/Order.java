package com.solvd.store.design_patterns.mvc_pattern.bill_generator;

class Order {

    private String orderNumber;
    private double orderValue;

    public Order(String orderNumber, double orderValue) {
        this.orderNumber = orderNumber;
        this.orderValue = orderValue;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }
}
