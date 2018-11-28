package com.springmvc.first.beans;

import java.util.LinkedHashMap;

public class Student {

	private LinkedHashMap<String, String> countryOptions;
	
	private String firstName;
	private String lastName;
	private String country;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student()
	{
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("br", "Brazil");
		countryOptions.put("In", "INDIA");
		countryOptions.put("AM", "AMERICA");
		countryOptions.put("UK", "United Kingdom");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
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
