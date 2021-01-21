package com.Klaus.Pizza;

import java.security.PublicKey;
import java.util.Vector;

public class Pizza {
    private int id;
    private String name;
    private Vector<Topping> toppings;
    private double basePrice;
    private double pizzaPrice;


    public Pizza(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        toppings = new Vector<>();
        this.basePrice = basePrice;
        this.pizzaPrice = basePrice;
    }

    public Pizza(Pizza that){
        this.id = that.getId();
        this.name = that.getName();
        toppings = new Vector<>();
        this.basePrice = that.getBasePrice();
        this.pizzaPrice = basePrice;

    }

    public void addTopping(Topping t) {
        toppings.add(t);
        this.pizzaPrice = pizzaPrice + t.getPrice();
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public String basePizzaToString() {
        return (id*(-1)) + " - " + name + " EUR "+ basePrice;

    }

    public void printPizza() {
        System.out.println(" Pizza " + name);
        System.out.println("  Zusätzliche Toppings:");
        for (var t : toppings) {
            System.out.println("    > " + t.toString());
        }
        System.out.println("Pizzapreis: EUR " + pizzaPrice);
        System.out.println();



    }
}




