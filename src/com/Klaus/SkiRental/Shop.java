package com.Klaus.SkiRental;

import java.util.Vector;

public class Shop {
    private static Shop instance;

    private Shop() {
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    private SalesPerson salesPerson;
    private WebShop webshop;
    private Vector<Item> items;


}
