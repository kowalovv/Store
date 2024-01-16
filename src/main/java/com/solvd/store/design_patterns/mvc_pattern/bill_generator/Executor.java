package com.solvd.store.design_patterns.mvc_pattern.bill_generator;

class Executor {

    public static void main(String[] args) {

    Order order = new Order("asd213dsa2131321", 132.24);

    OrderView orderView = new OrderView();

    OrderController orderController = new OrderController(order,orderView);

    orderController.updateOrderView();
    orderController.setOrderNumber("123");
    orderController.setOrderValue(300);
    orderController.updateOrderView();
}}
