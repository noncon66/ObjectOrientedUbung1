package com.Klaus.Pizza;

import java.util.Vector;

public class Topping {
    private int id;
    private String name;
    private double price;

    public Topping(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " = " + name;
    }
}
