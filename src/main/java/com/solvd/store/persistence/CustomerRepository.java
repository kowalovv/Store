package com.solvd.store.persistence;

import com.solvd.store.domain.Customer;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {

    void createCustomer(@Param("customer") Customer customer, @Param("companiesId") long companiesId) throws SQLException;

    List<Customer> getAllCustomers() throws SQLException;

    void removeCustomer(long customerId) throws SQLException;

    Customer getCustomerById(long customerId) throws SQLException;
}
