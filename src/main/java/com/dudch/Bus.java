package com.dudch;

public class Bus implements Car {

    FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public void drive() {
        System.out.println("Bus drives");
    }

    @Override
    public void getDailyFortune() {
        System.out.println(fortuneService.getFortune());
    }
}
