package com.solvd.store.service.impl;

import com.solvd.store.domain.Customer;
import com.solvd.store.persistence.CustomerRepository;
import com.solvd.store.persistence.impl.CustomerMapperImpl;
import com.solvd.store.service.CustomerService;

import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl() {
//        this.customerRepository = new CustomerRepositoryImpl();
        this.customerRepository = new CustomerMapperImpl();
    }

    @Override
    public Customer getCustomerById(long customerId) throws SQLException {
        if (customerId <= 100)
             return customerRepository.getCustomerById(customerId);
        else
            System.out.println("Try again. Max index number is 100");
        return null;
    }
}
