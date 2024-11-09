package com.example.package2;

public class Bike extends Vehicle{
    private boolean hasGear;

    public Bike(String make) {
        super(make);
    }

    public Bike(String make, String model, boolean hasGear) {
        super(make, model);
        this.hasGear = hasGear;
    }

    public boolean hasGear() {
        return hasGear;
    }

    @Override
    public void start() {
        System.out.println(make + " bike is starting.");
    }

    @Override
    public void move() {
        System.out.println(make + " bike is moving.");
    }
}
