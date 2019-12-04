package com.udemy.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
public class TennisCoach implements Coach {
	
	@Autowired  // @Autowired can be used directly in the constructor
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	//@Autowired // If there is a single Fortune Service implementation it is directly wired.
	// In case this is the only constructor, Autowired is not necessary.
	/*public TennisCoach(FortuneService fortuneService)
	{
		System.out.println("Fortune Service Constructor");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Work with the machine for 4 hours.";
	}
	
	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}


	public FortuneService getFortuneService() {
		return fortuneService;
	}


	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setting fortune service.");
		this.fortuneService = fortuneService;
	}

}
