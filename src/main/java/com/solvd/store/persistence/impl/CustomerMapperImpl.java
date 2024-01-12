package com.solvd.store.persistence.impl;

import com.solvd.store.domain.Customer;
import com.solvd.store.persistence.Connection.ConnectionPool;
import com.solvd.store.persistence.CustomerRepository;
import org.apache.ibatis.session.SqlSession;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerMapperImpl implements CustomerRepository {

    @Override
    public void createCustomer(Customer customer, long companiesId) throws SQLException {
        Connection connection = null;
        try (SqlSession sqlSession = ConnectionPool.getSessionFactory().openSession(true)) {
            connection = ConnectionPool.acquireConnection();
            CustomerRepository mapper = sqlSession.getMapper(CustomerRepository.class);
            mapper.createCustomer(customer, companiesId);
        } catch (InterruptedException e) {
            throw new SQLException("Unable to create customer ", e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }

    }

    @Override
    public List<Customer> getAllCustomers() throws SQLException {
        Connection connection = null;
        try (SqlSession sqlSession = ConnectionPool.getSessionFactory().openSession(true)) {
            connection = ConnectionPool.acquireConnection();
            CustomerRepository mapper = sqlSession.getMapper(CustomerRepository.class);
            List<Customer> allCustomers = mapper.getAllCustomers();
            return allCustomers;
        } catch (InterruptedException e) {
            throw new SQLException("Unable to get all customers ", e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }
    }

    @Override
    public void removeCustomer(long customerId) throws SQLException {
        Connection connection = null;
        try (SqlSession sqlSession = ConnectionPool.getSessionFactory().openSession(true)) {
            connection = ConnectionPool.acquireConnection();
            CustomerRepository mapper = sqlSession.getMapper(CustomerRepository.class);
            mapper.removeCustomer(customerId);
        } catch (InterruptedException e) {
            throw new SQLException("Unable to delete ", e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }
    }

    @Override
    public Customer getCustomerById(long customerId) throws SQLException {
        Connection connection = null;
        try (SqlSession sqlSession = ConnectionPool.getSessionFactory().openSession(true)) {
            connection = ConnectionPool.acquireConnection();
            CustomerRepository mapper = sqlSession.getMapper(CustomerRepository.class);
            return mapper.getCustomerById(customerId);
        } catch (InterruptedException e) {
            throw new SQLException("Unable to get Customer ", e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }
    }
}
