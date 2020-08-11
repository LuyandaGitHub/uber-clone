package com.company;

public class Driver extends Person {
//    THESE ARE INSTANCE VARIABLES...MEANING EACH INSTANCE OF THIS OBJECT HAS THEIR OWN COPY OF THESE VARIABLES
    private Car car;
    private String licenceNumber;

    //    THE CLASS CONSTRUCTOR IS A METHOD THAT IS CALLED WHEN AN OBJECT IS INSTANTIATED SO WE USE IT TO SET OUR INSTANCE VARIABLES

    public Driver(Car car, String licenceNumber, String name, String surname, String phoneNumber, double cash) {
        super(name, surname, phoneNumber, cash);

        this.car = car;
        this.licenceNumber = licenceNumber;

    }

//  WE USE SETTERS TO SET OR UPDATE INSTANCE VARIABLES
    public void setCar(Car car) {
        this.car = car;
    }

    public void setLicenceNumber(String licenceNumber) { this.licenceNumber = licenceNumber; }

//    WE USE GETTERS TO READ THE VALUES OF VARIABLES
    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public Car getCar() {
        return this.car;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "car=" + car +
                ", licenceNumber='" + licenceNumber + '\'' +
                '}';
    }
}
