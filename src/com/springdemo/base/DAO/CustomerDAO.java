package com.springdemo.base.DAO;

import java.util.List;

import com.springdemo.Hibernate.Entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

}
