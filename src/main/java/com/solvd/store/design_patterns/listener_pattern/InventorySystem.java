package com.solvd.store.design_patterns.listener_pattern;

class InventorySystem implements ProductListener {
    @Override
    public void onProductArrival(Product product) {
        System.out.println("Inventory System: Added " + product.getClass().getSimpleName() +
                " to inventory - Model: " + product.getModel());
    }
}