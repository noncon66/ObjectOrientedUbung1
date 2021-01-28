package com.Klaus.Museum;

import java.util.Random;
import java.util.Vector;

public class Museum {
    public static Random random = new Random();

    private String name;
    private Vector<Room> rooms;
    private Vector<Visitor> visitors;

    public Museum(String name) {
        this.name = name;
        rooms = new Vector<>();
        visitors = new Vector<>();
    }

    public void generateInitialMuseum(Museum museum, int noOfRooms) {
        for (int i = 0; i < noOfRooms; i++) {
            rooms.add(new Room(i + 1));
            //Raum mit 2 bis 6 Kunstwerken ausstatten
            int howManyArtworks = 2 + random.nextInt(5);
            for (int j = 1; j <= howManyArtworks; j++) {
                rooms.get(i).addRandomArtwork();
            }
        }
    }

    public void printMuseum(String prefix) {
        System.out.println(prefix + "Museum: " + this.getName());
        prefix = prefix + "  ";
        for (var r :
                rooms) {
            r.printRoom(prefix);
        }
        System.out.println();
    }


    public void startDay() {
        int startHour = 9;
        int endHour = 17;
        int minute = 0;

        int hour = startHour;

        addGuard();

        while (hour != endHour) {
            System.out.println();
            printTime(hour, minute);


            //move Visitors
            for (var visitor :
                    visitors) {
                visitor.doSomething();
            }
            clearMuseum();

            //add visitor or thief
            if (hour < endHour - 1) {
                Visitor newVisitor = VisitorFactory.generateVisitor();
                newVisitor.setCurrentMuseum(this);
                System.out.println(">> " + newVisitor.toString()
                        + " betritt das Museum");
                newVisitor.changeRoom();
                visitors.add(newVisitor);
            }

            minute = minute + 15;
            if (minute == 60) {
                hour++;
                minute = 0;
            }

        }
        System.out.println();
        printTime(hour, minute);
        for (var visitor :
                visitors) {
            visitor.leaveMuseum();
        }
        clearMuseum();

    }


    //----------------- Helper --------------------------
    private void printTime(int hour, int minute) {
        if (minute == 0) {
            System.out.println("Time: " + hour + ":00");
        } else {
            System.out.println("Time: " + hour + ":" + minute);
        }
    }


    public Room getRandomRoom() {
        return rooms.get(random.nextInt(rooms.size()));
    }

    public void clearMuseum() {
        Vector<Visitor> visitorsToRemove = new Vector<>();
        for (var visitor :
                visitors) {
            if (visitor.getCurrentMuseum() == null) {
                visitorsToRemove.add(visitor);
            }
        }

        for (var v :
                visitorsToRemove) {
            visitors.remove(v);
        }

        for (var room :
                rooms) {
            for (var v :
                    visitorsToRemove) {
                room.getVisitors().remove(v);
            }


        }
    }

    public void addGuard() {
        Guard g = VisitorFactory.generateGuard();
        g.currentMuseum = this;
        visitors.add(g);
        System.out.println(g.toString());
        g.changeRoom();

    }


    //------------------ Getter + Setter --------------------
    public String getName() {
        return name;
    }

}
