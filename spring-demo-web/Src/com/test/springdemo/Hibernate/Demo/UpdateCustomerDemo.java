package com.test.springdemo.Hibernate.Demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.springdemo.Hibernate.Entity.Customer;

public class UpdateCustomerDemo {

	public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
							  .addAnnotatedClass(Customer.class)
							  .buildSessionFactory();
                             
    Session session = factory.getCurrentSession();
    
    try {
    	
    	int customerId=1;
    	//Updating with Single Id Begin
    	session = factory.getCurrentSession();
    	session.beginTransaction();
    	
    	System.out.println("=====");
    	System.out.println("Getting Customer with id "+customerId); 
    	
    	Customer myCustomer = session.get(Customer.class, customerId);
    	System.out.println("Updating Customer Id with "+customerId);
    	myCustomer.setFirstName("Paul The First");
    	
    	session.getTransaction().commit();
    	//Updating with Single Id End

    	//Verification of Updates
    	System.out.println("=====");
        session=factory.openSession();
    	session.beginTransaction();
    	
    	System.out.println("Getting Customer with id Updated "+customerId);
    	myCustomer = session.get(Customer.class, customerId);	
     	System.out.println("Getting Customer with id Updated "+myCustomer.getFirstName());
     	
    	session.getTransaction().commit();
    	//Verification of Updates
    	
    	
    	//Updating Multiple Begin
    	System.out.println("=====");
        session=factory.openSession();
    	session.beginTransaction();
    	session.createQuery("update Customer set email='null@gmail.com'").executeUpdate();
    	
    	session.getTransaction().commit();
    	//Updating Multiple End

    }
    
    finally 
    {
     	factory.close();
    }
    
    
	}

	private static void displayCustomers(List<Customer> theCustomers) {
		for(Customer TheCustomer : theCustomers)
    	{	
    		System.out.println(TheCustomer);
    	}
	}

}



