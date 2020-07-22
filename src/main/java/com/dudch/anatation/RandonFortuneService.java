package com.dudch.anatation;


import com.dudch.beansscope.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandonFortuneService implements FortuneService {

    private final String[] availableFortunes = {
            "luck",
            "great luck",
            "maybe next time"
    };

    private final Random random = new Random();

    @Override
    public String getFortune() {
        return availableFortunes[random.nextInt(availableFortunes.length)];
    }
}
