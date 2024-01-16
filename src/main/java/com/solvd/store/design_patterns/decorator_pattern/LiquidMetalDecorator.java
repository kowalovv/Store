package com.solvd.store.design_patterns.decorator_pattern;

class LiquidMetalDecorator extends CpuDecorator{

    public LiquidMetalDecorator(Cpu decoratedCpu) {
        super(decoratedCpu);
    }

    @Override
    public double cost() {
        return super.cost() + 29.50;
    }

    @Override
    public String description() {
        return super.description() + ", with liquid metal instead of paste";
    }
}
