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
				
		context.close();
	}
}


