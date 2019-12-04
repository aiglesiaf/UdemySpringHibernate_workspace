package com.udemy.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is the fortune from the fortune service.";
	}

}
