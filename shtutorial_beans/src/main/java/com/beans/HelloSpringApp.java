package com.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myBean = appContext.getBean("myBaseballCoach", Coach.class);
		System.out.println(myBean.getWorkout());
		
		appContext.close();

	}

}
