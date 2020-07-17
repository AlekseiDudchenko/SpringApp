package com.dudch;

public class Truck implements Car {

    Driver driver;

    public Truck(Driver driver) {
        this.driver = driver;
    }


    @Override
    public void drive() {
        driver.greet();
        System.out.println("Truck drives!");
    }
}
