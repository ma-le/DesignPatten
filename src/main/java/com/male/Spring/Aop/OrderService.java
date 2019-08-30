package com.male.Spring.Aop;

public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder();
}
