package com.test.springdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")

public class TeacherController {

	@RequestMapping("/showForm")
	public String displayForm() 
	{
		return "teacher";
	}
}
