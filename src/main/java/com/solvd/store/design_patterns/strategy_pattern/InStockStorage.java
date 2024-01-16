package com.solvd.store.design_patterns.strategy_pattern;

class InStockStorage implements StorageStrategy {

    @Override
    public void processOrder(String order) {
        System.out.println("Order '" + order + "' stored in the warehouse.");
    }
}
