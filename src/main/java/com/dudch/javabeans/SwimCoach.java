package com.dudch.javabeans;

public class SwimCoach implements Coach {

    private final FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("\n" + this);
        System.out.println("SwimCoach.getDailyWorkout()");
        return "Swim 10k";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("\n" + this);
        System.out.println("SwimCoach.getDailyFortune()");
        return fortuneService.getFortune();
    }

}
