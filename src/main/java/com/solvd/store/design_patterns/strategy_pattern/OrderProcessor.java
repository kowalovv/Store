package com.solvd.store.design_patterns.strategy_pattern;

class OrderProcessor {
    private StorageStrategy storageStrategy;

    public void setStorageStrategy(StorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    public void processOrder(String order) {
        storageStrategy.processOrder(order);
    }
}