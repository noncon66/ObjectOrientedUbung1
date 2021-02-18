package com.Klaus.SkiRental;

import java.util.Vector;

public class Shop {
    private static Shop instance;

    private SalesPerson salesPerson;
    private WebShop webshop;
    private Vector<Item> items;
    private Vector<Customer> customers;

    private Shop() {
        this.salesPerson = null;
        this.webshop = null;
        this.items = new Vector<>();
        this.customers = new Vector<>();
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }


    public boolean checkAvailability(Vector<Category> wishList) {
        category:
        for (var w :
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

    public Reservation makeReservation(Vector<Category> whishlist) {
        Reservation r = new Reservation();
        category: for (var w :
                whishlist) {
            for (var item : items) {
                if (item.getCategory().equals(w) && !item.isRent() && !item.isReserved()) {
                    r.addItem(item);
                    item.reserve(true);
                    continue category;
                }
            }
        }
        return r;
    }

    public void rentReservation(Reservation reservation){
        for (var item :
                reservation.getItems()) {
            item.rent(true);
        }
        reservation.pickedUp(true);
    }





    public Vector<Customer> getCustomers() {
        return customers;
    }

    public void setItems(Vector<Item> items) {
        this.items = items;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public void setWebShop(WebShop webshop) {
        this.webshop = webshop;
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

}
