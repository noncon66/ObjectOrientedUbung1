package com.Klaus.SkiRental;

public class SalesPerson implements IProvider {
    private String name;

    public SalesPerson(String name) {
        this.name = name;
    }

    @Override
    public boolean isAvailable(Category cat) {
        return false;
    }

    @Override
    public void request(Category cat) {

    }

    public void pickUp (Reservation res){


    }
}
