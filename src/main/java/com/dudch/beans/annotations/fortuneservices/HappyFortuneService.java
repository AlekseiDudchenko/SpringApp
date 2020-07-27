package com.dudch.beans.annotations.fortuneservices;

import com.dudch.beans.beansscope.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
