package com.springdemo.base.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springdemo.Hibernate.Entity.Customer;
import com.springdemo.base.DAO.CustomerDAO;
import com.springdemo.base.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	//Rest of CRUD is below.
	///READ
	@GetMapping("/list")
		public String listCustomers(Model theModel)
		{
		// get customer DAO stuff
		List<Customer> RetrCustomers = customerService.getCustomers();
		
		//added to model here
		
		
		theModel.addAttribute("customers",RetrCustomers);
		
		return "list-customers";
		}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		Customer sentCustomer = new Customer();
		
		theModel.addAttribute("customer",sentCustomer);
		
		return "customer-form";
	}
	
	
	
	//CREATE
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer")Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		
		//Go back to list page
		return "redirect:/customer/list";
	}
	
	
	//UPDATE
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId")int theId,Model theModel)
	{
	//Come here after action kicked off in list-customers
	//Get your model from below
		Customer theCustomer=  customerService.getCustomer(theId);
	//Bind that to new pages model here	
		theModel.addAttribute("customer",theCustomer);
	//Go on your merry way.
		return "customer-form";
	}
	
	
	//DELETE
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId")int theId)
	{
			customerService.deleteCustomer(theId);
		
		//Go back to list page
		return "redirect:/customer/list";
	}
	
	
    @GetMapping("/search")
    public String searchCustomers(@RequestParam("theSearchName") String theSearchName,
                                    Model theModel) {

        // search customers from the service
        List<Customer> theCustomers = customerService.searchCustomers(theSearchName);
                
        // add the customers to the model
        theModel.addAttribute("customers", theCustomers);

        return "list-customers";        
    }

}
