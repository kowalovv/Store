package com.solvd.store.design_patterns.listener_pattern;

class WarehouseManager implements ProductListener {
    @Override
    public void onProductArrival(Product product) {
        System.out.println("Warehouse Manager: New " + product.getClass().getSimpleName() +
                " arrived - Model: " + product.getModel());
    }
}
