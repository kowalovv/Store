package com.solvd.store.service.impl;

import com.solvd.store.persistence.SupplierRepository;
import com.solvd.store.persistence.impl.SupplierRepositoryImpl;
import com.solvd.store.service.SupplierService;

public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository suplierRepository;

    public SupplierServiceImpl() {
        this.suplierRepository = new SupplierRepositoryImpl();
    }
}
