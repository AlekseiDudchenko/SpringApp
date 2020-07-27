package com.dudch.beans.injectpropertiesjava93;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private final FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

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

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

}
