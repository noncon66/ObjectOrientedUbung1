package com.Klaus.CarAndWorkshop;

public class GasStation {
    private String name;
    private double GasPricePerUnit;
    private double DieselPricePerUnit;

    public GasStation(String name, double gasPricePerUnit, double dieselPricePerUnit) {
        this.name = name;
        GasPricePerUnit = gasPricePerUnit;
        DieselPricePerUnit = dieselPricePerUnit;
    }

    public double getBill(String fuelType, double fuelAdded) {
        double bill = 0;
        switch (fuelType) {
            case "Diesel":
                bill = fuelAdded * getDieselPricePerUnit();
            break;
            case "Benzin":
                bill = fuelAdded * getGasPricePerUnit();
            break;
        }
        return bill;
    }


    public double getGasPricePerUnit() {
        return GasPricePerUnit;
    }

    public double getDieselPricePerUnit() {
        return DieselPricePerUnit;
    }

}
