package com.springdemo.base.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springdemo.Hibernate.Entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
@Autowired
private SessionFactory sessionFactory;
	//Transactional Annotation helps with not opening session and closing every time.
	@Override
	public List<Customer> getCustomers() {
		
	Session currentSession= sessionFactory.getCurrentSession();
	
	
	Query<Customer> theQuery=currentSession.createQuery("from Customer order by lastName asc", Customer.class);
	
	// execute query and get result list.
	List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}
	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theCustomer);
		
		
		
	}

}
