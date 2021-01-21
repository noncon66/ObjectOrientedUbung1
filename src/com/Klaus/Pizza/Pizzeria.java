package com.Klaus.Pizza;

import java.util.Vector;

public class Pizzeria {
    private String name;
    private Vector<Pizza> basePizzas;
    private Vector<Topping> toppingList;
    public Vector<Order> orders;

    public Pizzeria(String name) {
        this.name = name;
        basePizzas = new Vector<>();
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


    public void addBasePizza(Pizza p) {
        basePizzas.add(p);
    }

    public void addTopping(Topping t) {
        toppingList.add(t);
    }


    public Pizza findBasePizza(int id) {
        for (var p :
                basePizzas) {
            if (p.getId() == id) {
                return p;
            }
        }
    return null;
    }


    public void printBasePizzas() {
        System.out.println("Base Pizzas: ");
        for (var p :
                basePizzas) {
            System.out.println(p.basePizzaToString());
        }
    }

    public void printToppingList() {
        System.out.println("Mögliche Zusatztoppings:");
        for (var t :
                toppingList) {
            System.out.println(t.toString());

        }
    }

    public void printBill(int orderID){
        for (var o :
                orders ) {
            if (o.getId() == orderID){
                o.printOrder();
            }
        }

    }


}
