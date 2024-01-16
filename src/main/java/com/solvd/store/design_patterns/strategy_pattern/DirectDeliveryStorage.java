package com.solvd.store.design_patterns.strategy_pattern;

class DirectDeliveryStorage implements StorageStrategy {

    @Override
    public void processOrder(String order) {
        System.out.println("Order '" + order + "' sent directly to the delivery area.");
    }
}
