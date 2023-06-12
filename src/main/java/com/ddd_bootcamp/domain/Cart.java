package com.ddd_bootcamp.domain;

public class Cart {
    private Integer amount;
    private Product product;

    public void add(Product p, Integer a) {
        product = p;
        amount = a;
    }

    public String getProductType() {
        return product.getType();
    }

    public Integer getProductCount() {
        return amount;
    }
}