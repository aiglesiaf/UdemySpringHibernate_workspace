package com.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopesSpringApp {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("scopes-applicationContext.xml"))
		{
			Coach myBean = appContext.getBean("myBasketballCoach", Coach.class);
			
			System.out.println(myBean.getWorkout());
			System.out.println("Name1: "+myBean.getName());
			System.out.println("Email1: "+myBean.getEmail());
			System.out.println("Object1: "+myBean.toString());
			
			Coach myBean2 = appContext.getBean("myBasketballCoach", Coach.class);
			
			System.out.println(myBean2.getWorkout());
			System.out.println("Name2: "+myBean2.getName());
			System.out.println("Email2: "+myBean2.getEmail());
			System.out.println("Object2: "+myBean2.toString());
			
		} catch (Exception e) {
			System.out.println("Exception: "+e.getStackTrace());
		}
	}

}
