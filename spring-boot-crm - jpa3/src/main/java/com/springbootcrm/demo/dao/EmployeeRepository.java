package com.springbootcrm.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springbootcrm.demo.entity.Employee;


@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//http://localhost:8080/api-res/employees/4 is for puts,everything else is same
//we added api-res through application.properties file.	
//@RepositoryRestResource helps us change the name of endpoints from employees to members
	
}
