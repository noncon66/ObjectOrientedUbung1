package com.Klaus.Restaurant;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class Restaurant {
    private String name;
    private Vector<Table> tables;
    private Menu menu;
    private Queue<GuestGroup> queue;

    public Restaurant(String name) {
        this.name = name;
        this.tables = new Vector<>();
        this.menu = null;
        queue = new LinkedList<GuestGroup>();
    }

    public void addTable(int tableNumber, int seats) {
        tables.add(new Table(tableNumber, seats));
    }

    public void addMenu(Menu menu) {
        this.menu = menu;
    }

    public Table findTable(int groupSize) {
        Vector<Table> fittingTables = new Vector<>();
        for (var table :
                tables) {
            if (table.getSeats() >= groupSize && !table.isOccupied()) {
                fittingTables.add(table);
            }
        }
        int minSeats = Integer.MAX_VALUE;
        Table theFittingTable = null;
        for (var table :
                fittingTables) {
            if (table.getSeats() < minSeats) {
                minSeats = table.getSeats();
                theFittingTable = table;
            }
        }
        return theFittingTable;
    }

    public void addNewGroup(int maxSize) {
        int groupSize = randomBetween(1, maxSize);
        GuestGroup gg = new GuestGroup(groupSize);
        queue.offer(gg);
        System.out.println("Neue Gruppe: " + groupSize + " Personen");
    }


    public void seatGroupToTable(int groupSize, Table table) {
        table.setOccupied(true);
        table.setSeatsOccupied(groupSize);
    }

    public void groupLeavesTable(Table table) {
        table.setOccupied(false);
        table.setSeatsOccupied(0);
    }

    public int randomBetween(int min, int max) {
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;
        return random;
    }


}
