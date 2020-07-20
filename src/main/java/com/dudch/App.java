package com.dudch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        System.out.println(System.lineSeparator() + "myPassengerCar: ");
        Car myPassengerCar = context.getBean("myPassengerCarClass", Car.class);
        myPassengerCar.drive();
        myPassengerCar.getDailyFortune();

        System.out.println(System.lineSeparator() + "myTruck: ");
        Car myTruck = new Truck(new Driver(), new HappyFortuneService());
        myTruck.drive();
        myTruck.getDailyFortune();

        System.out.println(System.lineSeparator() + "secondTruck: ");
        Car secondTruck = context.getBean("myTruckClass", Car.class);
        secondTruck.drive();
        myTruck.getDailyFortune();

        System.out.println(System.lineSeparator() + "myBus");
        Car myBus = context.getBean("myBus", Car.class);
        myBus.drive();
        myBus.getDailyFortune();

        System.out.println(System.lineSeparator() + "busFromProperties");
        Car busFromProperties = context.getBean("busFromProperties", Car.class);
        busFromProperties.drive();
        busFromProperties.getDailyFortune();

        context.close();
    }
}
