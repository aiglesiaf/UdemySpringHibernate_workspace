package com.udemy.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
			// Coach coach = context.getBean("tennisCoach", Coach.class);
			Coach coach = context.getBean("tennisCoach", Coach.class);
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getFortune());
		} catch(Exception e)
		{
			System.out.println("Error from Main: "+e.getStackTrace());
		}

	}

}
