package com.dudch.xmlcontext.fortune;

import java.util.Random;

public class RandonFortuneService implements FortuneService {

    private String[] availableFortunes = {
            "luck",
            "great luck",
            "maybe next time"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        return availableFortunes[random.nextInt(availableFortunes.length)];
    }
}
