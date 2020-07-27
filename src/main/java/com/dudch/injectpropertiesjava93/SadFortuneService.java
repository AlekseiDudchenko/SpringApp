package com.dudch.injectpropertiesjava93;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        System.out.println("SadFortune.getFortune()");
        return "sad fortune";
    }
}
