package com.Klaus.Pizza;

import java.util.Vector;

public class Pizza {
    private String name;
    private Vector<Topping> toppings;
    private double basePrice;

    public Pizza(String name) {
        this.name = name;
        toppings = new Vector<>();
        this.basePrice = 6;
    }

    public void addTopping(Topping t) {
        toppings.add(t);
    }


    public String getName() {
        return name;
    }

    public void printPizza() {
        System.out.println("Pizza: " + name);
        System.out.println("Toppings:");
        for (var t : toppings) {
            System.out.println(t.toString());
        }


    }
}




