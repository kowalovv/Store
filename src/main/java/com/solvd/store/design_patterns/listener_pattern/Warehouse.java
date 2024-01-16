package com.solvd.store.design_patterns.listener_pattern;

import java.util.ArrayList;
import java.util.List;

class Warehouse {
    private List<ProductListener> productListeners = new ArrayList<>();

    public void addProductListener(ProductListener productListener) {
        productListeners.add(productListener);
    }

    public void removeProductListener(ProductListener productListener) {
        productListeners.remove(productListener);
    }

    public void notifyProductArrival(Product product) {
        for (ProductListener listener : productListeners) {
            listener.onProductArrival(product);
        }
    }

    public void newCPUCameIn(String cpuModel) {
        notifyProductArrival(new Cpu(cpuModel));
    }

    public void newGPUCameIn(String gpuModel) {
        notifyProductArrival(new Gpu(gpuModel));
    }
}

