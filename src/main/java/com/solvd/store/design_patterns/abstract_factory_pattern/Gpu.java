package com.solvd.store.design_patterns.abstract_factory_pattern;

class Gpu implements Product {

    private String model;

    public Gpu(String model) {
        this.model = model;
    }

    @Override
    public void display() {
        System.out.println("Gpu: " + model);
    }
}


