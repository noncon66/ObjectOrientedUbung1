package com.Klaus.Museum;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum("Guggenheim");
        museum.generateInitialMuseum(museum, 5);
        museum.printMuseum("");

        museum.startDay();


    }

}
