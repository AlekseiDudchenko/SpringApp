package com.dudch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Car myTrak = new Trak();
        Car myCar = context.getBean("myPassengerCarClass", Car.class);

        context.close();

        }
}
