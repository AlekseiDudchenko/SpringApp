package com.dudch.beans.xmlcontext;

import com.dudch.beans.xmlcontext.fortune.FortuneService;

public class Truck implements Car {

    private final Driver driver;

    private final FortuneService fortuneService;

    public Truck(Driver driver, FortuneService fortuneService) {
        this.driver = driver;
        this.fortuneService = fortuneService;
    }

    @Override
    public void drive() {
        driver.greet();
        System.out.println("Truck drives!");
    }

    @Override
    public void getDailyFortune() {
        System.out.println(fortuneService.getFortune());
    }
}
