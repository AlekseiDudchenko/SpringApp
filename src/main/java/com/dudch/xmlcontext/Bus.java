package com.dudch.xmlcontext;



import com.dudch.xmlcontext.fortune.FortuneService;

import java.util.logging.Logger;

public class Bus implements Car {

    public static Logger logger=Logger.getLogger("global");

    FortuneService fortuneService;
    String name;
    String brand;

    public Bus(){
        logger.info("Bus() no-arg constructor call");
    }

    public void setFortuneService(FortuneService fortuneService) {
       logger.info("setFortuneService call");
        this.fortuneService = fortuneService;
    }

    public String getName() {
        logger.info("getName() call. returns " + name);
        return name;
    }

    public void setName(String name) {
        logger.info("setName(" + name + ") call");
        this.name = name;
    }

    public String getBrand() {
        logger.info("getBrand() call. returns " + brand);
        return brand;
    }

    public void setBrand(String brand) {
        logger.info("setBrand(" + brand + ") call");
        this.brand = brand;
    }


    @Override
    public void drive() {
        System.out.println("This is a " + this.getBrand() + " bus");
        System.out.println("The name of the bus is " + this.getName());
        System.out.println("Bus drives");
    }

    @Override
    public void getDailyFortune() {
        System.out.println(fortuneService.getFortune());
    }

}
