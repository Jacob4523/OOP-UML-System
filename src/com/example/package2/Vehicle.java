package com.example.package2;

import com.example.package3.Movable;

public abstract class Vehicle implements Movable {
    protected String make;
    private String model;

    public Vehicle(String make) {
        this.make = make;
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    protected String getModel() {
        return model;
    }

    public abstract void start();

    public void move() {
        System.out.println(make + " is moving.");
    }
}