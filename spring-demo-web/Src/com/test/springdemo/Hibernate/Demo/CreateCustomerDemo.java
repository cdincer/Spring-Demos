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
    	System.out.println("Creating 3 new customer");
    	Customer tempCustomer1= new Customer("Paul","Walker1","paul@walker.com");
    	Customer tempCustomer2= new Customer("Paul","Crawler2","paul@crawler.com");
    	Customer tempCustomer3= new Customer("Paul","Flier3","paul@flier.com");
    	session.beginTransaction();
    	
    	System.out.println("Adding the customer");
    	session.save(tempCustomer1);
    	session.save(tempCustomer2);
    	session.save(tempCustomer3);
    	
    	
    	session.getTransaction().commit();
    	
    }
    finally {
    	factory.close();
    }
    
    
	}

}
