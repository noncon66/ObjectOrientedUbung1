package com.Klaus.ChristmasBakery;

import java.util.Vector;

public class Order {
    private Customer customer;
    private Vector<OrderItem> OrderItems;

    public Order(Customer customer, Vector<OrderItem> orderItems) {
        this.customer = customer;
        OrderItems = orderItems;
    }

    public Vector<OrderItem> getOrderItems() {
        return OrderItems;
    }
}
