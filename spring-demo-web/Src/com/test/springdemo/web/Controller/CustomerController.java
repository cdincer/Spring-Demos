package com.test.springdemo.web.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springdemo.web.Classes.Customer;
import com.test.springdemo.web.Classes.Student;

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
	
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer")Customer PostForm, BindingResult theBindingResult)
	{   //@Valid performs the validation rules on customer. Results of validation end up in binding result variable.
		//BindingResult variable is managed by Spring to see what happened with validation.We can query it to get more out of it.
		
		 System.out.println("theCustomer: " + PostForm.getFirstName()+" "+PostForm.getLastName());

		
		if(theBindingResult.hasErrors())
		{
			return "customer/customer-form";
		}else
		{
			return "customer/customer-confirmation";
		}
		
		
	}

}
