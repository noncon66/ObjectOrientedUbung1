package com.Klaus.CarAndWorkshop;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void enterCar(Car car){
        car.addDriver(this);
    }

    public void pay(double bill) {
        System.out.printf("%10.2f EUR bezahlt!", bill);
        System.out.println();
        System.out.println();
    }
}
