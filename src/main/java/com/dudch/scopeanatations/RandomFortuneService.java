package com.dudch.scopeanatations;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private final String[] availableFortunes = {
            "luck",
            "great luck",
            "maybe next time"
    };

    private final Random random = new Random();

    @Override
    public String getFortune() {
        System.out.println("RandomFortuneService.getFortune()");
        return availableFortunes[random.nextInt(availableFortunes.length)];
    }
}
