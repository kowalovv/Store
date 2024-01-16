package com.solvd.store.design_patterns.abstract_factory_pattern;

interface AbstractFactory {

    Product createCpu(String model);
    Product createGpu(String model);
}
