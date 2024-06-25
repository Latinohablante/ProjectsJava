package com.tiendasolid;

public class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
