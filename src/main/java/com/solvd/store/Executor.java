package com.solvd.store;


import com.solvd.store.domain.Employee;
import com.solvd.store.persistence.impl.EmployeeRepositoryImpl;
import com.solvd.store.service.impl.EmployeeServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Executor {

    public static void main(String[] args) throws SQLException {

        Employee employee = new Employee("Patryk", "Kowalow");
        EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl();

//        Test create
        employeeRepository.createEmployee(employee, 1, 1);

//        Test getAll
        List<Employee> all = employeeRepository.getAll();
        for (Employee employee1 : all) {
            System.out.println(employee1.getFirstName() + " " + employee1.getLastName());
        }

//            Test update
        employeeRepository.update(employee, 1L);

//        Test remove
        employeeRepository.remove(2L);

//        Test GetEntityByID
        Employee byId = employeeRepository.getEntityById(1L);
        System.out.println(byId);

//        Test  GetById from services
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Employee byId1 = employeeService.getById(3L);
        System.out.println();
        System.out.println("Printing info about return Employee: " + byId1.toString());


    }
}
