package com.solvd.store.persistence.impl;

import com.solvd.store.domain.Employee;
import com.solvd.store.persistence.Connection.ConnectionPool;
import com.solvd.store.persistence.EmployeeRepository;
import com.solvd.store.persistence.GenericRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository, GenericRepository<Employee, Long> {

    private static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO store.employees (first_name, last_name, " +
            "departments_id, details_id) VALUES (?, ?, ?, ?)";

    private static final String SELECT_ALL_EMPLOYEES_QUERY = "SELECT * FROM employees";

    private static final String UPDATE_EMPLOYEE_QUERY = "UPDATE store.employees SET first_name = ?, last_name = ?, departments_id = ?," +
            "details_id = ? WHERE id = ?";

    private static final String REMOVE_EMPLOYEE_QUERY = "DELETE FROM store.employees WHERE id = ?";

    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM store.employees WHERE id = ?";


    @Override
    public void createEmployee(Employee employee, long departmentId, long detailsId) {
        PreparedStatement ps;
        Connection connection = null;

        try {
            connection = ConnectionPool.acquireConnection();
            ps = connection.prepareStatement(INSERT_EMPLOYEE_QUERY,
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

    @Override
    public List<Employee> getAll() throws SQLException {
        Connection connection = null;
        List<Employee> list = new ArrayList<>();
        try {
            connection = ConnectionPool.acquireConnection();
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_EMPLOYEES_QUERY);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                list.add(mapResultSetToEmployee(resultSet));
            }
            return list;

        } catch (InterruptedException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }
    }

    @Override
    public void update(Employee entity, Long id) throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionPool.acquireConnection();
            PreparedStatement ps = connection.prepareStatement(UPDATE_EMPLOYEE_QUERY);
            setUserParameters(ps, "Paweł", "Dan", 2, 2);
            ps.setLong(5, id);
            ps.executeUpdate();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }

    }

    @Override
    public void remove(Long id) throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionPool.acquireConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_EMPLOYEE_QUERY);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }
    }

    @Override
    public Employee getEntityById(Long id) throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionPool.acquireConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return mapResultSetToEmployee(resultSet);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionPool.releaseConnection(connection);
        }
    }


    private Employee mapResultSetToEmployee(ResultSet resultSet) throws SQLException {
        return new Employee(
                resultSet.getLong("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name")
        );
    }

    private void setUserParameters(PreparedStatement preparedStatement, String name, String lastName, int departmentsId, int detailsId) throws SQLException {
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, lastName);
        preparedStatement.setLong(3, departmentsId);
        preparedStatement.setLong(4, detailsId);
    }
}




