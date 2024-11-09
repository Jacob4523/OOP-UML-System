package com.example.package1;

public class Dog extends Pet{
    public String breed;
    
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void move() {
        System.out.println(name + " is running.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}
