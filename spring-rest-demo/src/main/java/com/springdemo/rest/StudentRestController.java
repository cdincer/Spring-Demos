package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> theStudents= new ArrayList<>();
		
		
		theStudents.add(new Student("A1","B1"));
		theStudents.add(new Student("A2","B2"));
		theStudents.add(new Student("A3","B3"));
		theStudents.add(new Student("A4","B4"));
		theStudents.add(new Student("A01","B01"));

		return theStudents;
	}
	
}
