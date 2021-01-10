package com.Klaus.ChristmasBakery;

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery("TheHeaven");

        bakery.employ("Hans", "Vanillekipferl", new String[]{"Vanillekipferl", "Kokosbusserl", "Rumkugeln"});
        bakery.employ("Karl", "Rumkugeln", new String[]{"Rumkugeln", "Nussecken", "Zimtsterne"});
        bakery.employ("Erich", "Florentiner", new String[]{"Florentiner", "Nussecken", "Spritzgebäck", "Aniskekse"});

        bakery.registerCustomer("Simone", "Landstraße 3");
        bakery.registerCustomer("Daniela", "Stadtweg 12");

        bakery.customerOrder("Simone", "Vanillekipferl:2,Rumkugeln:10");



    }
}
