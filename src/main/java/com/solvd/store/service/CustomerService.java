package com.solvd.store.service;

import com.solvd.store.domain.Customer;

import java.sql.SQLException;

public interface CustomerService {

    public Customer getCustomerById(long customerId) throws SQLException;
}
