package com.Klaus.people;

public class Main {
    public static void main(String[] args) {
        People p1 = new People("Klaus", "Nussbaumer", 1978, "Bregenz", 'm');
        People p2 = new People("Sabrina", "Vonbrühl", 1974, "Feldkirch", 'f');
        People p3 = new People("Marcella", "Merholz", 1977, "Marktheidenfeld", 'f');

        printPerson(p1);
        printPerson(p2);
        printPerson(p3);

        p1.setLastName("Mustermann");

        printPerson(p1);

    }



    public static void printPerson (People p){
        System.out.printf("%-14s %-14s %-6d %-18s %s%n", p.getFirstName(), p.getLastName(), p.getBirthYear(),p.getBirthPlace(),p.getGender());
    }

    

}
