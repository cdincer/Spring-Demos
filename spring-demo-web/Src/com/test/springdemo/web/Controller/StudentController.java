package com.test.springdemo.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student PostForm)
	{
	 System.out.println("theStudent: " + PostForm.getFirstName()+" "+PostForm.getLastName());
		return "student-confirmation";
	}
	
	
}
