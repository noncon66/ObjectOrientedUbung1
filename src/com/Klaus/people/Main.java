package com.Klaus.people;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Klaus", "Nussbaumer", 1978, "Bregenz", 'm');
        Person p2 = new Person("Sabrina", "Vonbrühl", 1974, "Feldkirch", 'f');
        Person p3 = new Person("Marcella", "Merholz", 1977, "Marktheidenfeld", 'f');

        printPerson(p1);
        printPerson(p2);
        printPerson(p3);

        p1.setLastName("Mustermann");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.getClass().getName());
        System.out.println(p1.getClass().getSimpleName());

    }



    public static void printPerson (Person p){
        System.out.printf("%-14s %-14s %-6d %-18s %s%n", p.getFirstName(), p.getLastName(), p.getBirthYear(),p.getBirthPlace(),p.getGender());
    }

    

}
