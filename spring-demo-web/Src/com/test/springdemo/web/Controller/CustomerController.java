package com.test.springdemo.web.Controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springdemo.web.Classes.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		//True is for trimming a string to null if it has nothing but whitespace.
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	
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

		 //WhiteSpace Testing
		 //PostForm.setFirstName("|"+PostForm.getFirstName()+"|");
		 //PostForm.setLastName("|"+PostForm.getLastName()+"|");

		if(theBindingResult.hasErrors())
		{
			return "customer/customer-form";
		}else
		{
			return "customer/customer-confirmation";
		}
		
		
	}

}
