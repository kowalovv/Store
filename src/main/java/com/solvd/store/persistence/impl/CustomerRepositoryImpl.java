package com.solvd.store.persistence.impl;

import com.solvd.store.domain.Customer;
import com.solvd.store.persistence.CustomerRepository;

import java.sql.SQLException;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public void createCustomer(Customer customer, long companiesId) throws SQLException {

    }

    @Override
    public List<Customer> getAllCustomers() throws SQLException {
        return null;
    }

    @Override
    public void removeCustomer(long customerId) throws SQLException {

    }

    @Override
    public Customer getCustomerById(long customerId) throws SQLException {
        return null;
    }
}
