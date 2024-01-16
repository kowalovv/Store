package com.solvd.store.design_patterns.abstract_factory_pattern;

class Cpu implements Product{

    private String model;

    public Cpu(String model) {
        this.model = model;
    }

    @Override
    public void display() {
        System.out.println("Cpu: " + model);
    }
}
