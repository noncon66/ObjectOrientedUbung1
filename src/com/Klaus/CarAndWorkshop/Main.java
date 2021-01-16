package com.Klaus.CarAndWorkshop;

public class Main {
    public static void main(String[] args) {
        Driver karl = new Driver("Karl");
        Car vw = new Car("VW",
                "Diesel", 5.6, 60, 45,
                38000, 10000);

        GasStation shell = new GasStation("Shell", 1.09, 0.98);
        Workshop WCC = new Workshop("WestCoastCustoms", 20, 100);

        karl.enterCar(vw);
        vw.drive(100000, karl, shell, WCC);
    }
}
