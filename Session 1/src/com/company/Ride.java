package com.company;

public abstract class Ride {
//    THESE ARE INSTANCE VARIABLES...MEANING EACH INSTANCE OF THIS OBJECT HAS THEIR OWN COPY OF THESE VARIABLES
    private String pickupLocation;
    private String destination;

    public abstract double calculateDistance(String startPoint, String endPoint);

    public abstract double calculateCost(String startPoint, String endPoint);

    public abstract Driver assignDriver();

    public abstract void completePayment();

//  WE USE SETTERS TO SET OR UPDATE INSTANCE VARIABLES
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

//    WE USE GETTERS TO READ THE VALUES OF VARIABLES
    public String getDestination() {
        return destination;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "pickupLocation='" + pickupLocation + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}