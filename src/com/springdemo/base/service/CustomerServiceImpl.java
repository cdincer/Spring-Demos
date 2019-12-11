package com.springdemo.base.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.Hibernate.Entity.Customer;
import com.springdemo.base.DAO.CustomerDAO;




@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDOA;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDOA.getCustomers();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDOA.saveCustomer(theCustomer);

	}

}
