package com.Klaus.Camera;

public class Lens {
    private String brand;
    private int focalLengthMin;
    private int focalLengthMax;
    private int currentFocalLength;

    public Lens(String brand, int focalLengthMin, int focalLengthMax) {
        this.brand = brand;
        this.focalLengthMin = focalLengthMin;
        this.focalLengthMax = focalLengthMax;
        this.currentFocalLength = focalLengthMin;
    }

    public String getBrand() {
        return brand;
    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }

    public int getCurrentFocalLength() {
        return currentFocalLength;
    }

    public void setCurrentFocalLength(int currentFocalLength) {
        this.currentFocalLength = currentFocalLength;
    }

    @Override
    public String toString() {
        return "Lens: " + brand + " / " + focalLengthMin + "-" + focalLengthMax + "mm";
    }
}
