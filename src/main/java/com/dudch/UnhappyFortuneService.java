package com.dudch;

public class UnhappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is NOT your day";
    }
}
