package com.solvd.store.design_patterns.facade_pattern;

class Executor {

    public static void main(String[] args) {


        WarehouseFacade warehouseFacade = new WarehouseFacade();

        warehouseFacade.openWarehouse();
        System.out.println("----------------------");
        warehouseFacade.closeWarehouse();
    }
}