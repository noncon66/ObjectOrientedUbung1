package com.Klaus.SkiRental;

import java.util.Vector;

public class Simulation {
    public static void main(String[] args) {

        Shop skiSchuhTennis = Shop.getInstance();
        WebShop skiSchuhTennisOnline = WebShop.getInstance();
        SalesPerson harry = new SalesPerson("Harry");

        skiSchuhTennis.setItems(SimulationFactory.createItems(10));
        skiSchuhTennis.setSalesPerson(harry);
        skiSchuhTennis.setWebShop(skiSchuhTennisOnline);

        int errorCount = 0;
        for (int i = 0; i < 1 && errorCount < 10; i++) {
            try {
                skiSchuhTennis.addCustomer(SimulationFactory.createCustomer());
                errorCount = 0;
            } catch (SameNameException e) {
                i--;
                errorCount++;
            }
        }

        System.out.println(skiSchuhTennis.getCustomers().size());

        int tick = 0;
        while (tick < 1) {
            Vector<Category> wishlist = SimulationFactory.createCategoriesToRent();

            if (skiSchuhTennis.checkAvailability(wishlist)) {
                skiSchuhTennis.getCustomers().elementAt(0).setReservation(skiSchuhTennis.makeReservation(wishlist));
                skiSchuhTennis.rentReservation(skiSchuhTennis.getCustomers().elementAt(0).getReservation());
            }

                    tick++;
        }


    }


}
