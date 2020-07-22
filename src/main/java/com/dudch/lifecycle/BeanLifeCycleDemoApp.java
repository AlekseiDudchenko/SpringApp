package com.dudch.lifecycle;

import com.dudch.beansscope.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach theCoach = context.getBean("myCoachLC", Coach.class);

        Coach thePrototypeCoach = context.getBean("myCoachPrototypeLC", Coach.class);

        context.close();
    }

}








