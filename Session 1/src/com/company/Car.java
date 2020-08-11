package com.company;

//  THE Car CLASS IMPLEMENTS THE Vehicle INTERFACE
public class Car implements Vehicle {
    //    THESE ARE INSTANCE VARIABLES...MEANING EACH INSTANCE OF THIS OBJECT HAS THEIR OWN COPY OF THESE VARIABLES
    private String type;
    private String color;
    private String model;
    private String numberPlate;

    private double baseRate;

//    THE CLASS CONSTRUCTOR IS A METHOD THAT IS CALLED WHEN AN OBJECT IS INSTANTIATED SO WE USE IT TO SET OUR INSTANCE VARIABLES
    public Car(String color, String model, String numberPlate, String type) {
        this.type = type;
        this.color = color;
        this.model = model;
        this.baseRate = baseRate;
        this.numberPlate = numberPlate;

//      THIS IS TO DETERMINE THE baseRate OF THE RIDE, DEPENDING ON THE UBER SERVICE type REQUESTED
        if(type.equals("Uber X")) {
            this.baseRate = 20.00;
        } else {
            this.baseRate = 25.00;
        }
    }

//    WE USE GETTERS TO READ THE VALUES OF VARIABLES
//  INTERFACE METHOD OVERRIDES
    @Override
    public String getColor() { return this.color; }

    @Override
    public String getModel() { return this.model; }

    @Override
    public String getNumberPlate() { return this.numberPlate; }

    public String getType() { return this.type; }

    public double getBaseRate() { return this.baseRate; }

    //  WE USE SETTERS TO SET OR UPDATE INSTANCE VARIABLES
    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", baseRate=" + baseRate +
                '}';
    }
}
