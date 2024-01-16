package com.solvd.store.design_patterns.listener_pattern;

class Cpu implements Product {
    private String model;

    public Cpu(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}
