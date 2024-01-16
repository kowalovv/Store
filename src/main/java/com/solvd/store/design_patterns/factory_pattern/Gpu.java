package com.solvd.store.design_patterns.factory_pattern;

class Gpu implements Product {
    @Override
    public String createProduct() {
        return "Product GPU";
    }

    @Override
    public String toString() {
        return "GPU";
    }
}
