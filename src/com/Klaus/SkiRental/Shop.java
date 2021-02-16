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

    public boolean checkAvailability(Vector<Category> wishList) {
        category: for (var w :
                wishList) {
            for (var item : items) {
                if (item.getCategory().equals(w) && !item.isRent() && !item.isReserved()) {
                    continue category;
                }
            }
            return false;
        }
        return true;
    }


    public void setItems(Vector<Item> items) {
        this.items = items;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public void setWebshop(WebShop webshop) {
        this.webshop = webshop;
    }
}
