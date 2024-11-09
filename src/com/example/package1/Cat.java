package com.example.package1;


public class Cat extends Pet{
    private String color;
    
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void move() {
        System.out.println(name + " is walking.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}