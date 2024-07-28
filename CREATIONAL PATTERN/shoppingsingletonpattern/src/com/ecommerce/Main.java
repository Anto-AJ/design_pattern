package com.ecommerce;

public class Main {
    public static void main(String[] args) {
        SessionManager session1 = new SessionManager();
        SessionManager session2 = new SessionManager();

        session1.getCart().addItem("Laptop");
        session2.getCart().addItem("Phone");

        System.out.println("Session1 Cart: " + session1.getCart().getItems());
        System.out.println("Session2 Cart: " + session2.getCart().getItems());
    }
}
