package com.ecommerce;

public class SessionManager {
    private ShoppingCart cart;

    public SessionManager() {
        cart = ShoppingCart.getInstance();
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
