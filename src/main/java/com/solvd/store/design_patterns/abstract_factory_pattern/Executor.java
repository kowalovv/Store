package com.solvd.store.design_patterns.abstract_factory_pattern;

class Executor {
    public static void main(String[] args) {

        AbstractFactory factory = new ConcreteFactory();

        Product cpu = factory.createCpu("Ryzen 7 7700x");
        cpu.display();

        Product gpu = factory.createGpu("RTX 4070TI");
        gpu.display();


    }
}
