package com.solvd.store.service.impl;

import com.solvd.store.persistence.DetailRepository;
import com.solvd.store.persistence.impl.DetailRepositoryImpl;
import com.solvd.store.service.DetailService;

public class DetailServiceImpl implements DetailService {

    private final DetailRepository detailRepository;

    public DetailServiceImpl() {
        this.detailRepository = new DetailRepositoryImpl();
    }
}
