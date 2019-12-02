package com.test.springdemo.web.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//Prefix received from ProductCode
public class ProductCodeConstraintValidator implements ConstraintValidator<ProductCode,String> {

	private String productCodePrefix;
	
	@Override
	public void initialize(ProductCode theProductCode)
	{
		productCodePrefix=theProductCode.value();
	}
	
	
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		
		if(theCode != null)
		{
			result= theCode.startsWith(productCodePrefix);
		} 
		else 
		{
			result = true;
		}

		return result;
	}

}
