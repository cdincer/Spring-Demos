package com.springdemo.jpa4.thymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.jpa4.thymeleaf.dao.EmployeeRepository;
import com.springdemo.jpa4.thymeleaf.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	//Qualifier added in there to show what happens when you have 2 beans that have the same blueprint 
	//Specify which one to use
	@Autowired
	public EmployeeServiceImpl (EmployeeRepository theEmployeeRepository)
	{
		employeeRepository = theEmployeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Employee findById(int theId) {
		//Optional means different pattern instead of having to check for nulls 
		//Feature introduced in Java 8
		Optional<Employee> result = employeeRepository.findById(theId);
		
		Employee theEmployee= null;
		if(result.isPresent())
		{
			theEmployee = result.get();
		}
		else
		{
			throw new RuntimeException("Did not find employee id -" + theId);
		}
		
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}

}
