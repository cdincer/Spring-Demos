package com.test.springdemo.web.Classes;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.test.springdemo.web.Validation.ProductCode;

public class Customer {
	

	private String firstName;
	//Old 	@Size(min=1,max=5,message="is required")
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0,message="Min value must be more/equal than zero")
	@Max(value=10,message="Max value must be less than 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 chars/digits")
	private String postalCode;
	
	@ProductCode
	private String productCode;
	


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

	
	//FreePasses,PostalCode,CourseCode set/get begin
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	


	//FreePasses set/get end


}
