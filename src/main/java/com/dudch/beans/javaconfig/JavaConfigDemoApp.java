package com.dudch.beans.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotatonBeanScope-Context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
        Coach bettaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(System.lineSeparator() + "the same object:" + (alphaCoach == bettaCoach));
        System.out.println(alphaCoach + System.lineSeparator() + bettaCoach);

    }
}
