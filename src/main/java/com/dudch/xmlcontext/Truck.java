package com.dudch.xmlcontext;

import com.dudch.fortune.FortuneService;

public class Truck implements Car {

    Driver driver;
    FortuneService fortuneService;

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
