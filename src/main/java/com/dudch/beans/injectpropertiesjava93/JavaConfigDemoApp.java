package com.dudch.beans.injectpropertiesjava93;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(System.lineSeparator() + swimCoach);
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());

    }
}
