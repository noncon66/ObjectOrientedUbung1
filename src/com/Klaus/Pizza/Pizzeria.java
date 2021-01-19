package com.Klaus.Pizza;

import java.util.Vector;

public class Pizzeria {
    private String name;
    private Vector<Topping> toppingList;
    private Vector<Order> orders;

    public Pizzeria(String name) {
        this.name = name;
        toppingList = new Vector<>();
        orders = new Vector<>();
    }

    public Topping findTopping(int id) {
        for (var t :
                toppingList) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public Order getOrder(int id) {
        for (var order :
                orders) {
            if (order.getId() == id) {
                return order;
            }

        }
        return null;
    }

    public Pizza getPizzaFromOrder(int orderID, String pizzaName) {
        for (var order :
                orders) {
            if (order.getId() == orderID) {
                var pizza = order.getPizzaFromName(pizzaName);
                return pizza;
            }
        }
        return null;
    }


    public void addTopping(Topping t) {
        toppingList.add(t);
    }

    public void addOrder(int id) {
        orders.add(new Order(id));
    }

    public void printToppingList() {
        System.out.println("Toppings:");
        for (var t :
                toppingList) {
            System.out.println(t.toString());

        }
    }


}
