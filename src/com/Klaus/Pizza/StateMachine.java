package com.Klaus.Pizza;

import java.util.Scanner;

public class StateMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pizzeria napoli = new Pizzeria("Napoli");

        napoli.addBasePizza(new Pizza(-1, "Margherita", 6));
        napoli.addBasePizza(new Pizza(-2, "Salami", 6.5));
        napoli.addBasePizza(new Pizza(-3, "Prosciutto", 6.5));
        napoli.addBasePizza(new Pizza(-4, "Quattro Formaggi ", 7));
        napoli.addBasePizza(new Pizza(-5, "Funghi", 6));

        napoli.addTopping(new Topping(1, "Salami", 1));
        napoli.addTopping(new Topping(2, "Corn", 1));
        napoli.addTopping(new Topping(3, "Pineapple", 1));
        napoli.addTopping(new Topping(4, "Bacon", 1));
        napoli.addTopping(new Topping(5, "Onion", 1));


        while (true) {
            int orderID = 1;

            System.out.println("Starten mit 1");
            int newOrder = scanner.nextInt();
            if (newOrder == 1) {

                Order o = new Order(orderID);

                //orders in Pizzeria  is public
                napoli.orders.add(o);

                int morePizzas = 1;
                int pizzaID = 1;

                while (morePizzas == 1) {
                napoli.printBasePizzas();
                System.out.println("Welche Base Pizza?");
                    int bp = scanner.nextInt();
                    Pizza p = new Pizza(napoli.findBasePizza(bp * (-1)));
                    p.setId(pizzaID);

                    System.out.println("Auswahl: Pizza " + p.getName());
                    int topping = -1;
                    napoli.printToppingList();
                    System.out.println("0 - ABBRECHEN");
                    do {


                        topping = scanner.nextInt();
                        if (topping == 0) break;
                        Topping t = napoli.findTopping(topping);
                        p.addTopping(t);
                        System.out.println(t.getName() + " hinzugefügt");

                    }
                    while (topping != 0);
                    napoli.getOrder(orderID).addPizza(p);
                    System.out.println("Weitere Pizza? 0=nein / 1=ja");
                    morePizzas = scanner.nextInt();
                    pizzaID++;
                }

                System.out.println("Ihre Pizzas:");
                napoli.printBill(orderID);
                orderID++;
            }


        }


    }


}

