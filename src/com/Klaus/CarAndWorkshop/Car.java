package com.Klaus.CarAndWorkshop;

public class Car {
    private String name;
    private Driver driver;
    private String fuelType;
    private double fuelConsumptionPer100km;
    private int tankSize;
    private double fuelLevel;
    private int tireKmLeft;
    private int kmToServiceLeft;

    public Car(String name, String fuelType, double fuelConsumptionPer100km, int tankSize, int fuelLevel, int tireKmLeft, int kmToServiceLeft) {
        this.name = name;
        this.driver = null;
        this.fuelType = fuelType;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
        this.tankSize = tankSize;
        this.fuelLevel = fuelLevel;
        this.tireKmLeft = tireKmLeft;
        this.kmToServiceLeft = kmToServiceLeft;
    }

    public void drive(int howFar, Driver driver, GasStation gasStation, Workshop workshop) {
        int distance = 0;
        while (distance <= howFar) {
            if (fuelLevel < 2) {
                System.out.println("Nachtanken bei km " + distance);
                double bill = refuelAndGetBill(gasStation);
                driver.pay(bill);
            }
            if (tireKmLeft == 0 || kmToServiceLeft == 0) {
                System.out.println("In der Werkstatt bei km " + distance);
                int bill = goToWorkshopAndGetBill(workshop, tireKmLeft, kmToServiceLeft);
                driver.pay(bill);
            }
            tireKmLeft--;
            kmToServiceLeft--;
            fuelLevel -= fuelConsumptionPer100km / 100;
            distance++;
        }
    }

    private int goToWorkshopAndGetBill(Workshop workshop, int tireKmLeft, int kmToServiceLeft) {
        int serviceBill = 0;
        int tireBill = 0;
        if (kmToServiceLeft<1000){
            serviceBill = workshop.makeService(this);
        }
        if (tireKmLeft<3000){
            tireBill = workshop.changeTires(this);
        }
        return serviceBill + tireBill;

    }

    private double refuelAndGetBill(GasStation gasStation) {
        double fuelAdded = tankSize - fuelLevel;
        fuelLevel = tankSize;
        return gasStation.getBill(fuelType, fuelAdded);

    }

    public void addDriver(Driver driver) {
        this.driver = driver;
    }

    public void setTireKmLeft(int tireKmLeft) {
        this.tireKmLeft = tireKmLeft;
    }

    public void setKmToServiceLeft(int kmToServiceLeft) {
        this.kmToServiceLeft = kmToServiceLeft;
    }
}



