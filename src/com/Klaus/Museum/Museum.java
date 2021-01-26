package com.Klaus.Museum;

import java.util.Random;
import java.util.Vector;

public class Museum {
    public static Random random = new Random();

    private String name;
    private Vector<Room> rooms;
    private Vector<Visitor> visitors;
    private Vector<Thief> thiefs;
    private Guard guard;


    public Museum(String name) {
        this.name = name;
        rooms = new Vector<>();
        visitors = new Vector<>();
        thiefs = new Vector<>();

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

        guard = addGuard("Der Wächter");

        while (hour != endHour) {
            System.out.println();
            printTime(hour, minute);

            //move Visitors
            for (var visitor :
                    visitors) {
                visitor.doSomething();
            }
            clearMuseum();

            //move Thiefs
            for (var thief :
                    thiefs) {
                thief.doSomething();
            }
            clearMuseum();

            //move Guard
            guard.getCurrentRoom().setGuard(null);
            guard.setCurrentRoom(getRandomRoom());
            guard.getCurrentRoom().setGuard(guard);


            //add visitor
            if (hour < endHour - 1) {
                Visitor newVisitor = VisitorFactory.generateVisitor();
                newVisitor.setCurrentMuseum(this);
                System.out.println(">> " + newVisitor.getName() + " betritt das Museum");
                newVisitor.changeRoom();
                visitors.add(newVisitor);
            }

            //add Thiefs???


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

        Vector<Thief> thiefsToRemove = new Vector<>();
        for (var thief :
                thiefs) {
            if (thief.getCurrentMuseum() == null) {
                thiefsToRemove.add(thief);
            }
        }

        for (var v :
                visitorsToRemove) {
            visitors.remove(v);
        }

        for (var t :
                thiefsToRemove) {
            thiefs.remove(t);
        }

        for (var room :
                rooms) {
            for (var v :
                    visitorsToRemove) {
                room.getVisitors().remove(v);
            }
            for (var t :
                    thiefsToRemove) {
                room.getThiefs().remove(t);


            }


        }
    }

    public Guard addGuard(String name) {
        Guard newGuard = new Guard(name);
        newGuard.setCurrentRoom(getRandomRoom());
        newGuard.getCurrentRoom().setGuard(newGuard);
        return newGuard;
    }


    //------------------ Getter + Setter --------------------
    public String getName() {
        return name;
    }

}
