package com.dudch.anatation;

import com.dudch.beansscope.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("anatation-applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println("Fortune: " + tennisCoach.getDailyFortune() + System.lineSeparator());

		Coach setterCoach = context.getBean("setterCoach", Coach.class);
		System.out.println(setterCoach.getDailyWorkout());
		System.out.println("Fortune: " + setterCoach.getDailyFortune() + System.lineSeparator());

		Coach fieldInjectionCoach = context.getBean("fieldInjectionCoach", Coach.class);
		System.out.println(fieldInjectionCoach.getDailyWorkout());
		System.out.println("Fortune: " + fieldInjectionCoach.getDailyFortune() + System.lineSeparator());
				
		context.close();
	}
}


