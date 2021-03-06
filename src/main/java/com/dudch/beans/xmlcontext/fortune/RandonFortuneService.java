package com.dudch.beans.xmlcontext.fortune;

import java.util.Random;

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
