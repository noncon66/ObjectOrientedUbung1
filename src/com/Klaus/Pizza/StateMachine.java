package com.Klaus.Pizza;

import java.util.Vector;

public class StateMachine {

    public static void main(String[] args) {

        Pizzeria napoli = new Pizzeria("Napoli");


        Topping salami = new Topping(1 , "Salami", 1);
        Topping corn = new Topping(2 , "Corn", 1);
        Topping pineapple = new Topping(3 , "Pineapple", 1);
        Topping bacon = new Topping(4 , "Bacon", 1);
        Topping onions = new Topping(5 , "Onion", 1);

        Vector toppingList = new Vector();

        toppingList.add(corn);
        toppingList.add(pineapple);
        toppingList.add(bacon);
        toppingList.add(onions);


        //printToppings(toppingList);

    }

public void printToppings(Vector toppingList){
    for (var t :
           toppingList ) {
        System.out.println(toppingList.toString());

    }


}



}
