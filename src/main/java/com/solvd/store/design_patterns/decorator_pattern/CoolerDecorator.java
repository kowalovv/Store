package com.solvd.store.design_patterns.decorator_pattern;

class CoolerDecorator extends CpuDecorator{

    public CoolerDecorator(Cpu decoratedCpu) {
        super(decoratedCpu);
    }

    @Override
    public double cost() {
        return super.cost() + 150;
    }

    @Override
    public String description() {
        return super.description() + ", with external cooler";
    }
}
