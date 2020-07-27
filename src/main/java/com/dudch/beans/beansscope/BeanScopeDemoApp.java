package com.dudch.beans.beansscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		Coach theSingletonCoach = context.getBean("myCoachSingleton", Coach.class);
		Coach alphaSingletonCoach = context.getBean("myCoachSingleton", Coach.class);

		System.out.println("\n\nPointing to the same object: " + (theSingletonCoach == alphaSingletonCoach));
		System.out.println("Memory location for theSingletonCoach:   " + theSingletonCoach);
		System.out.println("Memory location for alphaSingletonCoach: " + alphaSingletonCoach);

		Coach betaPrototypeCoach = context.getBean("myCoachPrototype", Coach.class);
		Coach gammaPrototypeCoach = context.getBean("myCoachPrototype", Coach.class);

		System.out.println("\nPointing to the same object: " + (betaPrototypeCoach == gammaPrototypeCoach));
		System.out.println("Memory location for betaPrototypeCoach:  " + betaPrototypeCoach);
		System.out.println("Memory location for gammaPrototypeCoach: " + gammaPrototypeCoach + "\n\n");

		context.close();
	}

}








