package com.male.Spring.Aop;

public class OrderServiceImpl implements OrderService {
    private Order order = null;
    @Override
    public Order createOrder(String username, String product) {
        order = new Order();
        order.setProduct(product);
        order.setUsername(username);
        return null;
    }

    @Override
    public Order queryOrder() {
        return order;
    }
}
