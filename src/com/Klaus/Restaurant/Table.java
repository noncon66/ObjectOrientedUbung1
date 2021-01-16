package com.Klaus.Restaurant;

public class Table {
    private int tableNumber;
    private int seats;
    private boolean isOccupied;
    private int seatsOccupied;

    public Table(int tableNumber, int seats) {
        this.tableNumber = tableNumber;
        this.seats = seats;
        this.isOccupied = false;
        this.seatsOccupied = 0;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setSeatsOccupied(int seatsOccupied) {
        this.seatsOccupied = seatsOccupied;
    }

    @Override
    public String toString() {
        return
                "Tisch #" + tableNumber +
                " (" + seats + " Sitze)" +
                ", besetzt? " + isOccupied +
                " mit einer " + seatsOccupied + "er-Gruppe";
    }
}
