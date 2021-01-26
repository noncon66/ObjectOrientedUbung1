package com.Klaus.Museum;

public class Guard {
    private String name;
    private Room currentRoom;

    public Guard(String name) {
        this.name = name;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
