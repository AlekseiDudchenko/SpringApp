package com.dudch;

public class PassengerCar implements Car {

    FortuneService fortuneService;

    PassengerCar(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public void drive() {
        System.out.println("Passenger car drives!");
    }

    @Override
    public void getDailyFortune() {
        System.out.println(fortuneService.getFortune());
    }
}
