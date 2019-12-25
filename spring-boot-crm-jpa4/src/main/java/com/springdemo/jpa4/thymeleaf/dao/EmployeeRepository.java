package com.springdemo.jpa4.thymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.jpa4.thymeleaf.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//http://localhost:8080/api-res/employees/4 is for puts,everything else is same
//we added api-res through application.properties file.	
//@RepositoryRestResource helps us change the name of endpoints from employees to members
	
	//Literal dark magic it creates queries
public List<Employee> findAllByOrderByLastNameAsc();
}
