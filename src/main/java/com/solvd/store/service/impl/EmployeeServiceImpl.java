package com.solvd.store.service.impl;

import com.solvd.store.domain.Employee;
import com.solvd.store.persistence.EmployeeRepository;
import com.solvd.store.persistence.impl.EmployeeRepositoryImpl;
import com.solvd.store.service.EmployeeService;

import java.sql.SQLException;


public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
        this.employeeRepository = new EmployeeRepositoryImpl();
    }


    @Override
    public Employee getById(Long id) {
        EmployeeRepositoryImpl employeeRepositoryImpl = new EmployeeRepositoryImpl();
        try {
            Employee employee = employeeRepositoryImpl.getEntityById(id);
            if (employee == null) {
                System.out.println("Employee not found");
            } else
                System.out.println("User retrieved successfully: " + employee.getFirstName() + " " + employee.getLastName());
            return employee;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}






