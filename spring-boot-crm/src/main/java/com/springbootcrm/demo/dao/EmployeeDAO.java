package com.springbootcrm.demo.dao;

import java.util.List;

import com.springbootcrm.demo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);
}
