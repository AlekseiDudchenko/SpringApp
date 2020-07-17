package com.dudch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Car myPassengerCar = context.getBean("myPassengerCarClass", Car.class);
        Car myTruck = new Truck(new Driver());
        Car secondTruck = context.getBean("myTruckClass", Car.class);

        myPassengerCar.drive();
        myTruck.drive();
        secondTruck.drive();

        context.close();
    }
}
