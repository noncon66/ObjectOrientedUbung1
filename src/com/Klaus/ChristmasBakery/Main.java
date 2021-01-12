package com.Klaus.ChristmasBakery;

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery("TheHeaven");

        bakery.employ("Hans", "Vanillekipferl", new String[]{"Vanillekipferl", "Kokosbusserl", "Rumkugeln"}, 15);
        bakery.employ("Karl", "Rumkugeln", new String[]{"Rumkugeln", "Nussecken", "Zimtsterne"}, 13);
        bakery.employ("Erich", "Florentiner", new String[]{"Florentiner", "Nussecken", "Spritzgebäck", "Aniskekse"}, 14);

        bakery.registerCustomer("Simone", "Landstraße 3");
        bakery.registerCustomer("Daniela", "Stadtweg 12");

        bakery.customerOrder("Simone", "Vanillekipferl:2,Rumkugeln:10,Kokosbusserl:4,Nussecken:3");
        bakery.customerOrder("Daniela", "Florentiner:5,Rumkugeln:6,Spritzgebäck:7,Aniskekse:4");

        for (var order :
                bakery.getOrders()) {
            bakery.produceOrder(order);
        }



    }
}
