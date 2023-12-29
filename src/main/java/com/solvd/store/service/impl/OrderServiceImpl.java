package com.solvd.store.service.impl;

import com.solvd.store.persistence.OrderRepository;
import com.solvd.store.persistence.impl.OrderRepositoryImpl;
import com.solvd.store.service.OrderService;

public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl() {
        this.orderRepository = new OrderRepositoryImpl();
    }
}
