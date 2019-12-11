package com.springdemo.base.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springdemo.Hibernate.Entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
@Autowired
private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return null;
	}

}
