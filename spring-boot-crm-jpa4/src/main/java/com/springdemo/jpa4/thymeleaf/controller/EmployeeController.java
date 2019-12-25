package com.springdemo.jpa4.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springdemo.jpa4.thymeleaf.entity.Employee;
import com.springdemo.jpa4.thymeleaf.service.EmployeeService;


@Controller
@RequestMapping("/employees")
public class EmployeeController {

private EmployeeService MemployeesService;	
	
public EmployeeController(EmployeeService InEmployeeService)
{	
	MemployeesService =InEmployeeService;	
}

	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		List<Employee> employeeList = MemployeesService.findAll();
		
		// add to the spring model
		theModel.addAttribute("employees", employeeList);
		
		return "employees/list-employees";
	}
	@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {
	
		Employee theEmployee = new Employee();
		
		theModel.addAttribute("employee",theEmployee);
		
		return "employees/employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee)
	{
		MemployeesService.save(theEmployee);
		
		return "redirect:/employees/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,Model theModel) 
	{

	Employee theEmployee = MemployeesService.findById(theId);
	
	theModel.addAttribute("employee",theEmployee);
	
	return "employees/employee-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) 
	{

	Employee theEmployee = MemployeesService.findById(theId);
	
	MemployeesService.deleteById(theId);
	
	return "redirect:/employees/list";
	}
	
	
	
	
	
}









