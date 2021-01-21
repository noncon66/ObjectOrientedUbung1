package com.Klaus.Pizza;

import java.util.Vector;

public class Order {
    int id;
    private Vector<Pizza> pizzas;

    public Order(int id) {
        this.id = id;
        pizzas = new Vector<>();

    }

    public void addPizza(Pizza p) {
        pizzas.add(p);
    }



    public void printOrder() {
        int i = 1;
        for (var p :
                pizzas) {
            System.out.println("Pizza #" + p.getId());
            p.printPizza();
            i++;
        }
        System.out.println("TOTAL: EUR " + this.getOrderTotalPrice());

    }

    public double getOrderTotalPrice(){
        double totalPrice = 0;
        for (var p :
                pizzas) {
            totalPrice = totalPrice + p.getPizzaPrice();
        }
        return totalPrice;
    }

    public int getId() {
        return id;
    }
}
