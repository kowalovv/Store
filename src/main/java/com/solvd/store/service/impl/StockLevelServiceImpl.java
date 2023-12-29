package com.solvd.store.service.impl;

import com.solvd.store.persistence.StockLevelRepository;
import com.solvd.store.persistence.impl.StockLevelRepositoryImpl;
import com.solvd.store.service.StockLevelService;

public class StockLevelServiceImpl implements StockLevelService {

    private final StockLevelRepository stockLevelRepository;

    public StockLevelServiceImpl() {
        this.stockLevelRepository = new StockLevelRepositoryImpl();
    }
}
