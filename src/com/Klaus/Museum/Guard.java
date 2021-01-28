package com.Klaus.Museum;

public class Guard extends Visitor {

    public Guard(String name, int age, String placeOfResidence) {
        super(name, age, placeOfResidence);
    }

    public Room changeRoom() {
        Room newRoom;
        do {
            newRoom = currentMuseum.getRandomRoom();
        } while (newRoom.equals(currentRoom));

        currentRoom = newRoom;
        currentRoom.addVisitor(this);
        System.out.println(this.toStringShort() + " geht in Raum " + currentRoom.getRoomNumber());
        return newRoom;

    }


    public void doSomething() {
        changeRoom();
    }

    @Override
    public String toString() {
        return name + " (WÄCHTER, " + age + ") aus " + placeOfResidence;
    }

    public String toStringShort() {
        return name + " (WÄCHTER)";
    }

}
