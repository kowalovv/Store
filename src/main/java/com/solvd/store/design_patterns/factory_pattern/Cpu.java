package com.solvd.store.design_patterns.factory_pattern;

class Cpu implements Product{
    @Override
    public String createProduct() {
        return "Product CPU";
    }

    @Override
    public String toString() {
        return "CPU";
    }
}
