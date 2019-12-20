package com.springdemocrm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemocrm.entity.Customer;
import com.springdemocrm.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
//autowire the CustomerService

	@Autowired
	private CustomerService customerService;

	// customers READ
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
			return customerService.getCustomers();
	}
	
	//customers READ ONE
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId){
		
		Customer theCustomer = customerService.getCustomer(customerId);
		
		if(theCustomer == null)
		{   //Specialized error catch instead of global one
			throw new CustomerNotFoundException("Customer id not found -" + customerId);
		}
			return theCustomer;
	}
	
	
	//customers CREATE
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer theCustomer)
	{
		theCustomer.setId(0);
		customerService.saveCustomer(theCustomer);
		
		return theCustomer;
	}
	
	//customers UPDATE
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		
		return theCustomer;
	}
	
	//customers DELETE
	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		
		Customer tempCustomer = customerService.getCustomer(customerId);

		
		if(tempCustomer == null)
		{   //Specialized error catch instead of global one
			throw new CustomerNotFoundException("Customer id not found -" + customerId);
		}
		
		customerService.deleteCustomer(customerId);
		return "Deleted customer id -" + customerId;
	}
	
}
