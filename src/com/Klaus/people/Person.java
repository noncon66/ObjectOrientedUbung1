package com.Klaus.people;

import java.util.Objects;

//(Objekt-)Klasse
public class Person {

//Attribute
    private String firstName;
    private String lastName;
    private int birthYear;
    private String birthPlace;
    private char gender;

//Constructor
    public Person(String firstName, String lastName, int birthYear, String birthPlace, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthPlace = birthPlace;
        this.birthYear = birthYear;
        this.gender = gender;
    }

//getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public char getGender() {
        return gender;
    }

//setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String anrede = (gender == 'f')? "Frau ":"Herr ";
        return anrede + firstName + " " + lastName + ", geboren " + birthYear +
                " in " + birthPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //Adresse ist identisch
        if (o == null || getClass() != o.getClass()) return false; //
        Person person = (Person) o;
        return birthYear == person.birthYear &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthPlace, person.birthPlace);
    }
}
