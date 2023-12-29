package com.solvd.store.persistence.impl;

import com.solvd.store.domain.Employee;
import com.solvd.store.persistence.Connection.ConnectionPool;
import com.solvd.store.persistence.EmployeeRepository;

import java.sql.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {


    @Override
    public void createEmployee(Employee employee, long departmentId, long detailsId) {

        PreparedStatement ps;
        Connection connection = null;

        try {
            connection = ConnectionPool.acquireConnection();
            ps = connection.prepareStatement("INSERT INTO store.employees (first_name, last_name, " +
                            "departments_id, details_id) VALUES (?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setLong(3, departmentId);
            ps.setLong(4, detailsId);

            ps.executeUpdate();
            ResultSet resultSet = ps.getGeneratedKeys();
            while (resultSet.next()) {
                employee.setId(resultSet.getLong(1));
            }

        } catch (SQLException | InterruptedException e) {
            throw new RuntimeException("Unable to create employee ", e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }

    }
}



