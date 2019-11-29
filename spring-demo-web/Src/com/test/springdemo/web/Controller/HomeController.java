package com.test.springdemo.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String showPage()
	{
		//Page Menu Name Returner
	return "main-menu";	
	}

}
