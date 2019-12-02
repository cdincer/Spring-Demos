package com.test.springdemo.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springdemo.web.Classes.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		Customer PostAction = new Customer();
		
		theModel.addAttribute("customer",PostAction);

		
		return "customer/customer-form";
	}
	

}
