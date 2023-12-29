package com.solvd.store.service.impl;

import com.solvd.store.persistence.CompanyRepository;
import com.solvd.store.persistence.impl.CompanyRepositoryImpl;
import com.solvd.store.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl() {
        this.companyRepository = new CompanyRepositoryImpl();
    }
}
