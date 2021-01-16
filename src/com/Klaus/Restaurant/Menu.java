package com.Klaus.Restaurant;

import java.util.Vector;

import static com.Klaus.Restaurant.MenuItemType.*;

public class Menu {
    private String name;
    private Vector<String> drinks;
    private Vector<String> starters;
    private Vector<String> mains;
    private Vector<String> deserts;

    public Menu(String name) {
        this.name = name;
        this.drinks = new Vector<>();
        this.starters = new Vector<>();
        this.mains = new Vector<>();
        this.deserts = new Vector<>();
    }

    public void addItem(String name, MenuItemType type) {
        switch (type) {
            case DRINK:
                drinks.add(name);
                break;
            case STARTER:
                starters.add(name);
                break;
            case MAIN:
                mains.add(name);
                break;
            case DESSERT:
                deserts.add(name);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }




}