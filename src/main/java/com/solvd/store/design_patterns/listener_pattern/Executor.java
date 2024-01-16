package com.solvd.store.design_patterns.listener_pattern;

class Executor {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        ProductListener warehouseManager = new WarehouseManager();
        ProductListener inventorySystem = new InventorySystem();

        warehouse.addProductListener(warehouseManager);
        warehouse.addProductListener(inventorySystem);

        warehouse.newCPUCameIn("Intel i9");
        warehouse.newGPUCameIn("NVIDIA RTX 3080");

        warehouse.removeProductListener(warehouseManager);

        warehouse.newCPUCameIn("AMD Ryzen 7");
    }
}


