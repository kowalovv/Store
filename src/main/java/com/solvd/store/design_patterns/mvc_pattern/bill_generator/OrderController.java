package com.solvd.store.design_patterns.mvc_pattern.bill_generator;

class OrderController {

    private Order order;
    private OrderView orderView;

    public OrderController(Order order, OrderView orderView) {
        this.order = order;
        this.orderView = orderView;
    }

    public void setOrderNumber(String orderNumber){
        order.setOrderNumber(orderNumber);
    }

    public void setOrderValue(double value){
        order.setOrderValue(value);
    }

    public void updateOrderView(){
        orderView.printOrderDetail(order.getOrderNumber(), order.getOrderValue());
    }
}
