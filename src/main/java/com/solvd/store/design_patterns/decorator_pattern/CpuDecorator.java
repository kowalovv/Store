package com.solvd.store.design_patterns.decorator_pattern;

abstract class CpuDecorator implements Cpu {

    protected Cpu decoratedCpu;

    public CpuDecorator(Cpu decoratedCpu) {
        this.decoratedCpu = decoratedCpu;
    }

    @Override
    public double cost() {
        return decoratedCpu.cost();
    }

    @Override
    public String description() {
        return decoratedCpu.description();
    }
}
