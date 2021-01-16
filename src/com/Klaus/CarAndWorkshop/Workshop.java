package com.Klaus.CarAndWorkshop;

public class Workshop {
    private String name;
    private int serviceFee;
    private int tireFee;

    public Workshop(String name, int serviceFee, int tireFee) {
        this.name = name;
        this.serviceFee = serviceFee;
        this.tireFee = tireFee;
    }

    public int makeService(Car car) {
        System.out.println("Service gemacht");
        car.setKmToServiceLeft(15000);
        return serviceFee;
    }

    public int changeTires(Car car) {
        System.out.println("Reifen gewechselt");
        car.setTireKmLeft(40000);
        return tireFee;
    }
}
