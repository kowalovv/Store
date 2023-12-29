package com.solvd.store.service.impl;

import com.solvd.store.persistence.EmployeeRepository;
import com.solvd.store.persistence.impl.EmployeeRepositoryImpl;
import com.solvd.store.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
        this.employeeRepository = new EmployeeRepositoryImpl();
    }
}
