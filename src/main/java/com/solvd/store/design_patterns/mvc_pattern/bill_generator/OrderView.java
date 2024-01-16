package com.solvd.store.design_patterns.mvc_pattern.bill_generator;

class OrderView {

    public void printOrderDetail (String orderNumber, double value){
        System.out.println("Order: " + orderNumber + ", Value: " + value);
    }
}
