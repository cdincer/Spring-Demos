package com.test.springdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//for displaying initial form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	//method for processing the form

}
