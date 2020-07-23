package com.dudch.anatation;

import com.dudch.beansscope.Coach;
import com.dudch.beansscope.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterCoach implements Coach {

    private FortuneService fortuneService;

    public SetterCoach() {
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("\n" + this);
        System.out.println("SetterCoach.getDailyWorkout()");
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("\n" + this);
        System.out.println("SetterCoach.getDailyFortune()");
        return fortuneService.getFortune();
    }

}
