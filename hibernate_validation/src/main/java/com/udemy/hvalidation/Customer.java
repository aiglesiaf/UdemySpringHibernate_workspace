package com.udemy.hvalidation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	@NotNull(message = "No puede ser nulo")
	@Size(min = 1, message = "No puede estar en blanco")
	private String lastName;
	
	private int freePassages;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
