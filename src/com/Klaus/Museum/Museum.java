package com.Klaus.Museum;

import java.util.Random;
import java.util.Vector;

public class Museum {
   public static Random random = new Random();

    private String name;
    private Vector<Room> rooms;

    public Museum(String name) {
        this.name = name;
        rooms = new Vector<>();
    }

    public void generateInitialMuseum(Museum museum, int noOfRooms){
        for (int i = 0; i < noOfRooms ; i++) {
            rooms.add(new Room(i+1));
            //Raum mit 2 bis 6 Kunstwerken ausstatten
            int howManyArtworks = 2 + random.nextInt(5);
            for (int j = 1; j <= howManyArtworks; j++) {
                rooms.get(i).addRandomArtwork();
            }
        }
    }

    public void printMuseum(String prefix){
        System.out.println(prefix + "Museum: " + this.getName());
        prefix = prefix + "  ";
        for (var r :
                rooms) {
            r.printRoom(prefix);
        }
    }


    public void startDay(){
        int startHour = 9;
        int endHour = 17;
        int minute = 0;

        int hour = startHour;
        while (hour != endHour){

            //put what happens here!

            minute = minute + 15;
            if (minute == 60){
                hour++;
                minute = 0;
            }
            printTime(hour, minute);
        }
    }


//----------------- Helper --------------------------
    private void printTime(int hour, int minute) {
        if (minute == 0) {
            System.out.println("Time: " + hour + ":00");
        }
        else {
            System.out.println("Time: " + hour + ":" + minute);
        }
    }




//------------------ Getter + Setter --------------------
    public String getName() {
        return name;
    }

}
