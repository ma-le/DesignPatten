package com.male.Spring.Aop;

public class Order {

    private String username;
    private String product;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Order() {
    }

    public Order(String username, String product) {

        this.username = username;
        this.product = product;
    }
}
