package com.dudch.anatation;

import com.dudch.beansscope.Coach;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		System.out.println("\n" + this);
		System.out.println("TennisCoach.getDailyWorkout()\n");
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
