package com.solvd.store.service.impl;

import com.solvd.store.persistence.ProductRepository;
import com.solvd.store.persistence.impl.ProductRepositoryImpl;
import com.solvd.store.service.ProductService;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl() {
        this.productRepository = new ProductRepositoryImpl();
    }
}
