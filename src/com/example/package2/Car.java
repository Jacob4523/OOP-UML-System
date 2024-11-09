package com.example.package2;

public class Car extends Vehicle{
    private int numofDoors;

    public Car(String make) {
        super(make);
    }

    public Car(String make, String model, int numofDoors) {
        super(make, model);
        this.numofDoors= numofDoors;
    }

    public int getNumofDoors() {
        return numofDoors;
    }

    @Override
    public void start() {
        System.out.println(make + " car is starting.");
    }

    @Override
    public void move() {
        System.out.println(make + " car is driving.");
    }
}
