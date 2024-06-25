package com.tiendasolid;

import java.util.ArrayList;
import java.util.List;

// Clase Pedido
public class Order {
    private List<Product> products;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }



}
