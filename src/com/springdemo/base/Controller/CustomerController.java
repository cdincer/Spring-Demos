package com.springdemo.base.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.Hibernate.Entity.Customer;
import com.springdemo.base.DAO.CustomerDAO;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	
	@RequestMapping("/list")
		public String listCustomers(Model theModel)
		{
		// get customer DAO stuff
		List<Customer> RetrCustomers = customerDAO.getCustomers();
		
		//added to model here
		
		
		theModel.addAttribute("customers",RetrCustomers);
		
		return "list-customers";
		}
	

}
