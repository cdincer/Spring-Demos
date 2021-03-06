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


	//GET ALL
	@Override
	public List<Customer> getCustomers() {
		
	Session currentSession= sessionFactory.getCurrentSession();
	
	
	Query<Customer> theQuery=currentSession.createQuery("from Customer order by lastName asc", Customer.class);
	
	// execute query and get result list.
	List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}
	
	
	//CREATE
	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
		
		
		
	}
	
	//GET ONE
	@Override
	public Customer getCustomer(int theId) {
		Session currentSession= sessionFactory.getCurrentSession();
		
		Customer theCustomer = currentSession.get(Customer.class, theId);
		
		return theCustomer;
	}


	@Override
	public void deleteCustomer(int theId) {
	Session currentSession= sessionFactory.getCurrentSession();
    //One way to delete with query shenanigans
	//	Query theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		
	//	theQuery.setParameter("customerId", theId);
		
    //theQuery.executeUpdate();
	
	//Hibernate shenanigans
	Customer theCustomer = currentSession.get(Customer.class, theId);
	currentSession.delete(theCustomer);

	}
	
	
	//Main Menu Search
    @Override
    public List<Customer> searchCustomers(String theSearchName) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        Query theQuery = null;
        
        //
        // only search by name if theSearchName is not empty
        //
        if (theSearchName != null && theSearchName.trim().length() > 0) {

            // search for firstName or lastName ... case insensitive
            theQuery =currentSession.createQuery("from Customer where lower(firstName) like :theName or lower(lastName) like :theName", Customer.class);
            theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");

        }
        else {
            // theSearchName is empty ... so just get all customers
            theQuery =currentSession.createQuery("from Customer", Customer.class);            
        }
        
        // execute query and get result list
        List<Customer> customers = theQuery.getResultList();
                
        // return the results        
        return customers;
        
    }

}
