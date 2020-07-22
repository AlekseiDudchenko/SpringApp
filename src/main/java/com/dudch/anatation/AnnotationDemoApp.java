package com.dudch.anatation;

import com.dudch.beansscope.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("anatation-applicationContext.xml");
		
		Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
				
		context.close();
		
	}

}


