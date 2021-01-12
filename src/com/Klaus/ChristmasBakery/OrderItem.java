package com.Klaus.ChristmasBakery;

public class OrderItem {
    private Cookie cookie;
    private int amount;

    public OrderItem(Cookie cookie, int amount) {
        this.cookie = cookie;
        this.amount = amount;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public int getAmount() {
        return amount;
    }
}
