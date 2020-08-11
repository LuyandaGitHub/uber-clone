package com.company;

public class Person {
    //    THESE ARE INSTANCE VARIABLES...MEANING EACH INSTANCE OF THIS OBJECT HAS THEIR OWN COPY OF THESE VARIABLES
    private String name;
    private String surname;
    private String phoneNumber;

    private double cash;

//    THE CLASS CONSTRUCTOR IS A METHOD THAT IS CALLED WHEN AN OBJECT IS INSTANTIATED SO WE USE IT TO SET OUR INSTANCE VARIABLES
    public Person(String name, String surname, String phoneNumber, double cash) {
        this.name = name;
        this.cash = cash;
        this.surname = surname;
        this.phoneNumber = phoneNumber;

    }

//  WE USE SETTERS TO SET OR UPDATE INSTANCE VARIABLES
    public void setName(String name) {
        name = name;
    }

    public void setSurname(String surname) {
        surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public void setCash(Double cash) {
        cash = cash;
    }

//    WE USE GETTERS TO READ THE VALUES OF VARIABLES
    public String getSurname() {
        return this.surname;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double getCash() {
        return this.cash;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cash=" + cash +
                '}';
    }
}
