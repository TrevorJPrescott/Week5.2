package com.trevorpc.car.models;

public class Car {

    //variables
    String make;
    String model;
    String year;
    String engine;
    double mpg;
    boolean fourWheelDrive;


    //constructors
    public Car() {
    }

    public Car(String make, String model, String year, String engine, double mpg, boolean fourWheelDrive) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.mpg = mpg;
        this.fourWheelDrive = fourWheelDrive;
    }


    // getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Make='" + make + '\'' +
                ", Model='" + model + '\'' +
                ", Year='" + year + '\'' +
                "MPG='" + mpg + '\'' +
                ", Engine='" + engine + '\'' +
                ", Four Wheel Drive='" + fourWheelDrive + '\'' +
                '}';
    }
}