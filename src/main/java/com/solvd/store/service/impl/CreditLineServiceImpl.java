package com.solvd.store.service.impl;

import com.solvd.store.persistence.CreditLineRepository;
import com.solvd.store.persistence.impl.CreditLineRepositoryImpl;
import com.solvd.store.service.CreditLineService;

public class CreditLineServiceImpl implements CreditLineService {

    private final CreditLineRepository creditLineRepository;

    public CreditLineServiceImpl() {
        this.creditLineRepository = new CreditLineRepositoryImpl();
    }
}
