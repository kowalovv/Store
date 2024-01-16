package com.solvd.store.design_patterns.listener_pattern;

class Gpu implements Product{

    private String model;

    public Gpu(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}