package com.dudch.beans.xmlcontext.fortune;

public class UnhappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is NOT your day";
    }

}
