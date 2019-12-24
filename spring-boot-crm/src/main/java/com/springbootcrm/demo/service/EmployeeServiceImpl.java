package com.springbootcrm.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootcrm.demo.dao.EmployeeDAO;
import com.springbootcrm.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO ImplEmployeeDAO;
	
	public EmployeeServiceImpl (EmployeeDAO theEmployeeDAO)
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
