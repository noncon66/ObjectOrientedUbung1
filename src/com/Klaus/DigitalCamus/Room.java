package com.Klaus.DigitalCamus;

public class Room {
    private Building building;
    private String name;
    private int floor;

    public Room(Building building, String name, int floor) {
        this.building = building;
        this.name = name;
        this.floor = floor;
    }

    public String  getLocation(){
        String location = String.format("Ort: %s, %s, %d. Stock", building.getName(), name, floor);
        return location;
    }
}


