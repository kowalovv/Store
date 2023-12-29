package com.solvd.store.service.impl;

import com.solvd.store.persistence.MarginRepository;
import com.solvd.store.persistence.impl.MarginRepositoryImpl;
import com.solvd.store.service.MarginService;

public class MarginServiceImpl implements MarginService {

    private final MarginRepository marginRepository;

    public MarginServiceImpl() {
        this.marginRepository = new MarginRepositoryImpl();
    }
}
