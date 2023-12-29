package com.solvd.store.service.impl;

import com.solvd.store.persistence.CustomerRepository;
import com.solvd.store.persistence.impl.CustomerRepositoryImpl;
import com.solvd.store.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl() {
        this.customerRepository = new CustomerRepositoryImpl();
    }
}
