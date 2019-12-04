package com.beans;

public class BasketCoach implements Coach {

	private String name;
	private String email;
	
	public BasketCoach(String name) {
		super();
		System.out.println("1. Constructing BasketCoach Bean.");
		this.name = name;
	}
	
	public void init() {
		System.out.println("3. My customed bean initialization.");
	}

	public void cleanUp() {
		System.out.println("My customed bean destroy.");
	}

	public String getWorkout() {
		return "Throw 100 times.";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("2. Setting property email.");
		this.email = email;
	}

	public String getName() {
		return name;
	}

}
