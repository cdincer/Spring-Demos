package com.test.springdemo.web.Classes;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	private LinkedHashMap<String,String> CountryOptions;
	

	public Student()
	{
	
		CountryOptions= new LinkedHashMap<>();
		
		CountryOptions.put("BR","Brazil");
		CountryOptions.put("FR","France");
		CountryOptions.put("DE","Germany");
		CountryOptions.put("IN","India");

	}

	// Setters/Getters Begin
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
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	// Setters/Getters End

	public LinkedHashMap<String, String> getCountryOptions() {
		return CountryOptions;
	}

	

}
