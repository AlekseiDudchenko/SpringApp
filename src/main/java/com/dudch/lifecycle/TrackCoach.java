package com.dudch.lifecycle;

import com.dudch.beansscope.Coach;
import com.dudch.beansscope.FortuneService;
import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "TrackCoach.getDailyFortune(): " + fortuneService.getFortune();
    }

    public void startUpSingleton() {
        System.out.println("\n" + this);
        System.out.println("TrackCoach.startUpSingleton()\n");
    }

    public void cleanUpSingleton() {
        System.out.println("\n" + this);
        System.out.println("TrackCoach:cleanUpSingleton()\n");
    }

    public void startUpPrototype() {
        System.out.println("\n" + this);
        System.out.println("TrackCoach.startUpPrototype()\n");
    }

    public void cleanUpPrototype() { //never called
        System.out.println("\n" + this);
        System.out.println("TrackCoach:cleanUpPrototype()\n");
    }

    @Override
    public void destroy() throws Exception {  //called for singleton also without mentioning in context.xml
        System.out.println("\n" + this);
        System.out.println("TrackCoach:destroy()\n");
    }
}










