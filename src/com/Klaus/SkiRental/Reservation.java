package com.Klaus.SkiRental;

import java.util.Vector;

public class Reservation {
    private Vector<Item> items;
    private boolean wasPickedUp;
    private int ticksSinceReservation;
    private int ticksSincePickUp;

    public Reservation() {
        this.items = new Vector<>();
        this.wasPickedUp = false;
        this.ticksSincePickUp = 0;
        this.ticksSinceReservation = 0;
    }

    public void addItem(Item i){
        items.add(i);
    }

    public Vector<Item> getItems() {
        return items;
    }

    public void pickedUp(boolean wasPickedUp) {
        this.wasPickedUp = wasPickedUp;
    }
}
