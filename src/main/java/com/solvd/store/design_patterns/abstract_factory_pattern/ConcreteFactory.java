package com.solvd.store.design_patterns.abstract_factory_pattern;

class ConcreteFactory implements AbstractFactory{
    @Override
    public Product createCpu(String model) {
        return new Cpu(model);
    }

    @Override
    public Product createGpu(String model) {
        return new Gpu(model);
    }
}
