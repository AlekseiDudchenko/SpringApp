package com.dudch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Car myTruck = new Truck();
        Car myPassengerCar = context.getBean("myPassengerCarClass", Car.class);

        myPassengerCar.drive();
        myTruck.drive();

        context.close();

        }
}
