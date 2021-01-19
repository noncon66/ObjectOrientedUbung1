package com.Klaus.Pizza;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class StateMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pizzeria napoli = new Pizzeria("Napoli");

        Topping salami = new Topping(1, "Salami", 1);
        Topping corn = new Topping(2, "Corn", 1);
        Topping pineapple = new Topping(3, "Pineapple", 1);
        Topping bacon = new Topping(4, "Bacon", 1);
        Topping onions = new Topping(5, "Onion", 1);

        napoli.addTopping(salami);
        napoli.addTopping(corn);
        napoli.addTopping(pineapple);
        napoli.addTopping(bacon);
        napoli.addTopping(onions);

        //napoli.printToppingList();

        while (true) {
            int orderID = 1;

            System.out.println("Starten mit 1");
            int input1 = scanner.nextInt();
            if (input1 == 1) {
                napoli.addOrder(orderID);
                System.out.println("Auswahl:");
                int input2 = -1;
                do {
                    napoli.printToppingList();
                    System.out.println("(0 = Abbrechen)");
                    input2 = scanner.nextInt();
                    if (input2 == 0) break;
                    Topping t = napoli.findTopping(input2);
                    napoli.getOrder(orderID).addPizza("Pizza");
                    napoli.getPizzaFromOrder(1, "Pizza").addTopping(t);
                    System.out.println(t.getName() + " hinzugefügt");

                }
                while (input2 != 0);
                System.out.println("Ihre Pizza:");
                napoli.getPizzaFromOrder(orderID, "Pizza").printPizza();
                orderID++;
            }


        }


    }


}

