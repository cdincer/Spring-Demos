package com.test.springdemo.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springdemo.web.Classes.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		Student PostAction = new Student();
		
		
		theModel.addAttribute("student",PostAction);
		
		return "student-form";
	}
	
	
	
	
	
}
