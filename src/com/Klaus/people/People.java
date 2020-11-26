package com.Klaus.people;

//(Objekt-)Klasse
public class People {

//Attribute
    private String firstName;
    private String lastName;
    private int birthYear;
    private String birthPlace;
    private char gender;

//Constructor
    public People (String firstName, String lastName, int birthYear, String birthPlace, char gender){
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
}
