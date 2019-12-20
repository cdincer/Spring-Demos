package com.springdemocrm.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	
	//Catching all with Exception variable
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception exc)
	{
		CustomerErrorResponse error= new CustomerErrorResponse(HttpStatus.BAD_REQUEST.value(),exc.getMessage()+" modified",System.currentTimeMillis()
				);
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);		
	}
	
	
	
	
}
