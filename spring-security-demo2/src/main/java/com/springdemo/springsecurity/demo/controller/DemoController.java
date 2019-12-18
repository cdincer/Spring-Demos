package com.springdemo.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	
	@GetMapping("/")
	public String showHome()
	{
		
		return "home";
	}
	
	
	
	@GetMapping("/leaders")
	public String showLeaders()
	{
		
		return "leaders";
	}
	
	
	@GetMapping("/admins")
	public String showAdmins()
	{
		
		return "admins";
	}
	
	
}
