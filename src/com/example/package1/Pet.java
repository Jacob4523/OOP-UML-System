package com.example.package1;

import com.example.package3.SoundMaker;

public abstract class Pet implements SoundMaker {
    protected String name;
    private int age;
    
    public Pet(String name) {
        this.name = name;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    public abstract void move();

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
