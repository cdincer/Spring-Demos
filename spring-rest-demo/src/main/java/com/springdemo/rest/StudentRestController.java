package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;
	//@PostConstruct is used once
	
	@PostConstruct
	public void loadData()
	{
     	theStudents= new ArrayList<>();
		
		
		theStudents.add(new Student("A1","B1"));
		theStudents.add(new Student("A2","B2"));
		theStudents.add(new Student("A3","B3"));
		theStudents.add(new Student("A4","B4"));
		theStudents.add(new Student("A01","B01"));
		
	}
	
	
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
	  return theStudents;
	}
	
	//getting single student
	//address example:api/students/{studentid}
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		
		return theStudents.get(studentId);
	}
	
}
