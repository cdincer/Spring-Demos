package com.springbootcrm.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootcrm.demo.dao.EmployeeDAO;
import com.springbootcrm.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO ImplEmployeeDAO;
	//Qualifier added in there to show what happens when you have 2 beans that have the same blueprint 
	//Specify which one to use
	@Autowired
	public EmployeeServiceImpl ( @Qualifier("employeeDAOJpaImpl")EmployeeDAO theEmployeeDAO)
	{
		ImplEmployeeDAO = theEmployeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return ImplEmployeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return ImplEmployeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		ImplEmployeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		ImplEmployeeDAO.deleteById(theId);
	}

}
