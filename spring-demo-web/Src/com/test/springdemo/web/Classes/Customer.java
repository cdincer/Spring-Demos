package com.test.springdemo.web.Classes;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,max=5,message="is required")
	private String lastName;
	
	@Min(value=0,message="Min value must be more/equal than zero")
	@Max(value=10,message="Max value must be less than 10")
	private int freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 chars/digits")
	private String postalCode;
	
	

	//firstName,LastName set/get begin
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
	//firstName,LastName set/get end

	
	//FreePasses,PostalCode set/get begin
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	//FreePasses set/get end


}
