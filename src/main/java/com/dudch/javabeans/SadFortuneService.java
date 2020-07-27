package com.dudch.javabeans;


import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        System.out.println("SadFortune.getFortune()");
        return "sad fortune";
    }
}
