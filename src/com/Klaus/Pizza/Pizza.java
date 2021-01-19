package com.Klaus.Pizza;

import java.util.Vector;

public class Pizza {
    private String name;
    private Vector<Topping> toppings;
    private double basePrice;

    public Pizza(String name, double basePrice) {
        this.name = name;
        toppings = new Vector<>();
        this.basePrice = basePrice;
    }

    public void addTopping(Topping t) {
        toppings.add(t);
    }


    public void printPizza() {
        System.out.println("Pizza: " + name);
        System.out.println("Toppings:");
        System.out.println();
          for(var t: toppings){
              System.out.println(t.toString());
          }


    }
}




