package com.test.springdemo.web;

import java.time.LocalDate;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//for displaying initial form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	//method for processing the form,basic method for testing
	@RequestMapping("/processForm")
	public String processForm()
	{
	return "helloWorld";	
    }
	
	//Read Form Data and Add attributes
	@RequestMapping("/processFormVersionTwo")
	public String processFormAdvanced(HttpServletRequest request,Model model)
	{
		//Get student name and make the surname in uppercase and get the record access date.
		String theName = request.getParameter("studentName");
		LocalDate DateTimeNow = LocalDate.now();
		
		String DateTimeString = DateTimeNow.toString();
		String[] UpperCaser = theName.split(" ");
		theName = UpperCaser[0].toString() + "  "+UpperCaser[1].toUpperCase().toString();
		
		model.addAttribute("StudentName",theName);
		model.addAttribute("RecordAccess",DateTimeString);
		
		return "helloWorld";
	}
	
	
}
