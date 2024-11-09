package com.example.packagemain;

import com.example.package1.Pet;
import com.example.package1.Dog;
import com.example.package1.Cat;
import com.example.package2.Vehicle;
import com.example.package2.Car;
import com.example.package2.Bike;
import com.example.package4.Logger;
import com.example.package4.Utils;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Buddy", 5, "Golden Retriever");
        dog.move();
        dog.makeSound();

        Pet cat = new Cat("Whiskers", 3, "Black");
        cat.move();
        cat.makeSound();

        Vehicle car = new Car("Toyota", "Camry", 4);
        car.start();
        car.move();

        Vehicle bike = new Bike("Yamaha", "FZ", true);
        bike.start();
        bike.move();

        Utils.printVersion();

        Logger logger = Logger.getInstance();
        logger.log("Application started");
        logger.log("This is a debug message.", 1);
    }
}
