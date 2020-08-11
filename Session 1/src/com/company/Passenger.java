package com.company;

public class Passenger extends Person  {
//    THESE ARE INSTANCE VARIABLES...MEANING EACH INSTANCE OF THIS OBJECT HAS THEIR OWN COPY OF THESE VARIABLES
    private String email;

//    THE CLASS CONSTRUCTOR IS A METHOD THAT IS CALLED WHEN AN OBJECT IS INSTANTIATED SO WE USE IT TO SET OUR INSTANCE VARIABLES
    public Passenger(String email, String name, String surname, String phoneNumber, double cash) {
        super(name, surname, phoneNumber, cash);

        this.email = email;
    }

//  WE USE SETTERS TO SET OR UPDATE INSTANCE VARIABLES
    public void setEmail(String email) {
        this.email = email;
    }

//    WE USE GETTERS TO READ THE VALUES OF VARIABLES
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "email='" + email + '\'' +
                '}';
    }
}
