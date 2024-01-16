package com.solvd.store.design_patterns.proxy_pattern;

class Executor {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // The real image is loaded only when calling the display method
        image1.display();
        image1.display(); // The real image is not loaded again, as it has been cached

        image2.display();
    }
}
