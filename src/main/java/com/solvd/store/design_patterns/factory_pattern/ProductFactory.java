package com.solvd.store.design_patterns.factory_pattern;

class ProductFactory {

    public static void main(String[] args) {
        Product cpu = createProduct("cpu");
        System.out.println("Printing result: " + cpu);
    }

    public static Product createProduct(String type) {
        if (type.equals("gpu")) {
            return new Gpu();
        } else if (type.equals("cpu")) {
            return new Cpu();
        }
        throw new IllegalArgumentException("Invalid product type");


    }
}
