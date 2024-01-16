package com.solvd.store.design_patterns.decorator_pattern;

class Ryzen7_7700x implements Cpu{
    @Override
    public double cost() {
        return 1500;
    }

    @Override
    public String description() {
        return "Ryzen 7 7700X";
    }
}
