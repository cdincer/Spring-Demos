package com.springdemo.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/LoginPage")
	public String showMyLoginPage()
	{
		
		return "advanced-login";
	}
	

	
	//Access-Denied spot
	
	@GetMapping("/access-denied")
	public String showAccessDenied()
	{
		
		return "access-denied";
	}
	
}
