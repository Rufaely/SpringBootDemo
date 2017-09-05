package com.example.demo;

public class Persons {

	private String firstName = "Ruafel";
	private String lastName = "Kidanemariam Yohannes ";
	private String email = "ruafel.yohannes@gmail.com";

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getFirstName() + " " + getLastName() + " " + getEmail();
	}

}
