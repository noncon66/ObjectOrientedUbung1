package com.Klaus.ChristmasBakery;

import java.util.Vector;

public class Employee {
    private String name;
    private Cookie favouriteCookie;
    private Vector<Cookie> cookies;
    private int productionCapacityTotal;
    private int productionCapacityLeft;


    public Employee(String name, Cookie favouriteCookie, String[] cookiesList, int productionCapacityTotal) {
        this.name = name;
        this.favouriteCookie = favouriteCookie;
        cookies = new Vector<>();
        for (var cookie :
                cookiesList) {
            cookies.add(new Cookie(cookie));
        }
        this.productionCapacityTotal = productionCapacityTotal;
        this.productionCapacityLeft = this.productionCapacityTotal;

    }

    public void produce(int amount){
        productionCapacityLeft -= amount;
    }

    public String getName() {
        return name;
    }

    public Cookie getFavouriteCookie() {
        return favouriteCookie;
    }

    public Vector<Cookie> getCookies() {
        return cookies;
    }

    public int getProductionCapacityLeft() {
        return productionCapacityLeft;
    }
}
