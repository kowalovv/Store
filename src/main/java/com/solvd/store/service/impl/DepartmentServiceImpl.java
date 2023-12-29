package com.solvd.store.service.impl;

import com.solvd.store.persistence.DepartmentRepository;
import com.solvd.store.persistence.impl.DepartmentRepositoryImpl;
import com.solvd.store.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl() {
        this.departmentRepository = new DepartmentRepositoryImpl();
    }
}
