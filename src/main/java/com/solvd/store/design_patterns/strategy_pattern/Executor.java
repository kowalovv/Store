package com.solvd.store.design_patterns.strategy_pattern;

class Executor {

    public static void main(String[] args) {

        OrderProcessor goodsProcessor = new OrderProcessor();
        goodsProcessor.setStorageStrategy(new InStockStorage());

        goodsProcessor.processOrder("331dsa21");

        goodsProcessor.setStorageStrategy(new DirectDeliveryStorage());
        goodsProcessor.processOrder("3123dgfgas3231");
    }
}
