package com.dudch.scopeannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotatonBeanScope-Context.xml");

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
        Coach bettaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(System.lineSeparator() + "the same object:" + (alphaCoach == bettaCoach));
        System.out.println(alphaCoach + System.lineSeparator() + bettaCoach);

        Coach alphaPrototypeCoach = context.getBean("prototypeTennisCoach", Coach.class);
        Coach bettaPrototypeCoach = context.getBean("prototypeTennisCoach", Coach.class);

        System.out.println(System.lineSeparator() + "the same object:" + (alphaPrototypeCoach == bettaPrototypeCoach));
        System.out.println(alphaPrototypeCoach + System.lineSeparator() + bettaPrototypeCoach);

    }
}
