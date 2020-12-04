package com.Klaus.Camera;

public class MemoryCard {
    String brand;
    int capacity; //in Megabyte
    double currentUsedSpace; //in Megabyte

    public MemoryCard(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
        this.currentUsedSpace = 0;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getCurrentUsedSpace() {
        return currentUsedSpace;
    }

    public void setCurrentUsedSpace(double currentUsedSpace) {
        this.currentUsedSpace = currentUsedSpace;
    }

    public double getCurrentFreeSpace(){
        return capacity - currentUsedSpace;
    }

    @Override
    public String toString() {
        return "MemoryCard: " + brand + " / " + capacity + "MB";
    }
}
