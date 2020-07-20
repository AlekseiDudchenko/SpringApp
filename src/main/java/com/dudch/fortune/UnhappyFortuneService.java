package com.dudch.fortune;

import com.dudch.fortune.FortuneService;

public class UnhappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is NOT your day";
    }
}
