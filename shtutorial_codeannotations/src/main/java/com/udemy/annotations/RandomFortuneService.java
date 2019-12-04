package com.udemy.annotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Random Fortune: "+Math.floor(Math.random()*100);
	}

}
