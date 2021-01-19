package com.Klaus.Pizza;

import java.util.Vector;

public class Order {
    int id;
    private Vector<Pizza> pizzas;

    public Order(int id) {
        this.id = id;
        pizzas = new Vector<>();
    }

    public void addPizza(String name) {
        pizzas.add(new Pizza(name));
    }

    public void printOrder(Order o) {
        int i = 1;
        for (var p :
                pizzas) {
            System.out.println("Pizza (" + i + ")");
            p.printPizza();
            i++;
        }

    }

    public Pizza getPizzaFromName(String name) {
        for (var pizza : pizzas
        ) {
            if (pizza.getName().equals(name)) {
                return pizza;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }
}
