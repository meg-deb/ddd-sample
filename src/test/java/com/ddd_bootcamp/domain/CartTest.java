package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

class CartTest {

    @Test
    void shouldAddProductToCart() {
        Product applePencil = new Product("applePencil");
        Cart mycart = new Cart();
        mycart.add(applePencil, 1);
        assert(mycart.getProductCount()).equals(1);
    }
    @Test
    void shouldAddSonyHeadphoneToCart() {
        Product sonyHeadphone = new Product("SonyWirelessHeadphone");
        Cart mycart = new Cart();
        mycart.add(sonyHeadphone, 1);
        assert(mycart.getProductCount()).equals(1);
    }
    @Test
    void shouldAdd2AProductToCart() {
        Product applePencil = new Product("applePencil");
        Cart mycart = new Cart();
        mycart.add(applePencil, 2);
        assert(mycart.getProductCount()).equals(2);
    }
}