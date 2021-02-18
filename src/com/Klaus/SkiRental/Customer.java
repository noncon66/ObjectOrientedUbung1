package com.Klaus.SkiRental;

import java.util.Vector;

public class Customer {
    private String name;
    private Reservation reservation;

    public Customer(String name) {
        this.name = name;
    }

    public void tryToRent(Vector<Category> categories, Shop shop){



    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }
}
