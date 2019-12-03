package com.test.springdemo.Hibernate.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.springdemo.Hibernate.Entity.Customer;

public class CreateCustomerDemo {

	public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
							 .addAnnotatedClass(Customer.class)
							 .buildSessionFactory();
    
    Session session = factory.getCurrentSession();
    
    try {
    	//use the session object so save Java object
    	System.out.println("Creating new customer");
    	Customer tempCustomer= new Customer("Paul","Climber","paul@climber.com");
    	
    	session.beginTransaction();
    	
    	System.out.println("Adding the customer");
    	session.save(tempCustomer);
    	session.getTransaction().commit();
    	
    }
    finally {
    	factory.close();
    }
    
    
	}

}
