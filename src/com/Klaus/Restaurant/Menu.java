package com.Klaus.Restaurant;

import java.util.Vector;

import static com.Klaus.Restaurant.MenuItemType.*;

public class Menu {
    private String name;
    private Vector<MenuItem> drinks;
    private Vector<MenuItem> starters;
    private Vector<MenuItem> mains;
    private Vector<MenuItem> deserts;

    public Menu(String name) {
        this.name = name;
        this.drinks = new Vector<>();
        this.starters = new Vector<>();
        this.mains = new Vector<>();
        this.deserts = new Vector<>();
    }

    public void addItem(String name, MenuItemType type, double price) {
        MenuItem m = new MenuItem(name, type, price);
        switch (type) {
            case DRINK:
                drinks.add(m);
                break;
            case STARTER:
                starters.add(m);
                break;
            case MAIN:
                mains.add(m);
                break;
            case DESSERT:
                deserts.add(m);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }




}