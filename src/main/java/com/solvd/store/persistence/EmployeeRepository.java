package com.solvd.store.persistence;

import com.solvd.store.domain.Employee;

public interface EmployeeRepository {
    void createEmployee(Employee employee, long departmentId, long detailsId);
}
