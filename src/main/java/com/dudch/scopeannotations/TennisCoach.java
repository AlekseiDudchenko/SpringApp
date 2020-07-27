package com.dudch.scopeannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private final FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("\n" + this);
        System.out.println("TennisCoach.getDailyWorkout()");
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("\n" + this);
        System.out.println("TennisCoach.getDailyFortune()");
        return fortuneService.getFortune();
    }

}
