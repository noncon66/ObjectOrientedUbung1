package com.Klaus.SkiRental;

public class Item {
    private Category category;
    private String inventoryId;
    private boolean isRent;
    private boolean isReserved;


    public Item(Category category, String inventoryId) {
        this.category = category;
        this.inventoryId = inventoryId;
        this.isRent = false;
        this.isReserved = false;
    }
}
