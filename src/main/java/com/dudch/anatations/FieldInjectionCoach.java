package com.dudch.anatations;

import com.dudch.beansscope.Coach;
import com.dudch.beansscope.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        System.out.println("\n" + this);
        System.out.println("FieldInjectionCoach.getDailyWorkout()");
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("\n" + this);
        System.out.println("FieldInjectionCoach.getDailyFortune()");
        return fortuneService.getFortune();
    }
}
