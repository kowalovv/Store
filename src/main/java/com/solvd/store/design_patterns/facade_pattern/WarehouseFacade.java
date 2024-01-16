package com.solvd.store.design_patterns.facade_pattern;

class WarehouseFacade {

    private InventorySystem inventorySystem;
    private LightingSystem lightingSystem;
    private SecuritySystem securitySystem;

    public WarehouseFacade() {
        this.inventorySystem = new InventorySystem();
        this.lightingSystem = new LightingSystem();
        this.securitySystem = new SecuritySystem();
    }



    public void openWarehouse() {
        securitySystem.deactivateSecurity();
        lightingSystem.lightsOn();
    }

    public void closeWarehouse() {
        inventorySystem.updateInventory();
        lightingSystem.lightsOff();
        securitySystem.activateSecurity();
    }
}
