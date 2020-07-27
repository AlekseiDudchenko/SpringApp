package com.dudch.beans.javabeans89;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach swimCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println("Fortune: " + swimCoach.getDailyFortune() + System.lineSeparator());

    }
}
