package com.Klaus.Restaurant;

public class MenuItem {
    private String name;
    private MenuItemType type;
    private double price;

    public MenuItem(String name, MenuItemType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
}
