package com.solvd.store.design_patterns.decorator_pattern;

class Executor {

    public static void main(String[] args) {

        Cpu cpu = new Ryzen7_7700x();
        System.out.println(cpu.description());
        System.out.println(cpu.cost());

        System.out.println("----------------");

        Cpu cpuWithCooler = new CoolerDecorator(cpu);
        System.out.println(cpuWithCooler.description());
        System.out.println(cpuWithCooler.cost());

        System.out.println("----------------");

        Cpu cpuWithCoolerAndLiquid = new LiquidMetalDecorator(new CoolerDecorator(cpu));
        System.out.println(cpuWithCoolerAndLiquid.description());
        System.out.println(cpuWithCoolerAndLiquid.cost());

    }
}
