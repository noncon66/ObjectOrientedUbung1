package com.Klaus.Restaurant;

import java.util.Vector;

public class Restaurant {
    private String name;
    private Vector<Table> tables;
    private Menu menu;

    public Restaurant(String name) {
        this.name = name;
        this.tables = new Vector<>();
        this.menu = null;
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

    public void seatGroupToTable(int groupSize, Table table) {
        table.setOccupied(true);
        table.setSeatsOccupied(groupSize);
    }

    public void groupLeavesTable(Table table) {
        table.setOccupied(false);
        table.setSeatsOccupied(0);
    }




}
