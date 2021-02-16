package com.Klaus.SkiRental;

public class Simulation {
    public static void main(String[] args) {

        Shop SkiSchuhTennis = Shop.getInstance();
        WebShop SkiSchuhTennisOnline = WebShop.getInstance();
        SalesPerson harry = new SalesPerson("Harry");

        SkiSchuhTennis.setItems(SimulationFactory.createItems(10));
        SkiSchuhTennis.setSalesPerson(harry);
        SkiSchuhTennis.setWebshop(SkiSchuhTennisOnline);

        Customer customer = SimulationFactory.createCustomer();
        //customer.tryToRent(SimulationFactory.createCategoriesToRent(), );









    }


}
