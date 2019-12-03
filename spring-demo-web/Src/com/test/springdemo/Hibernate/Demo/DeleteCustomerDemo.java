package com.test.springdemo.Hibernate.Demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.springdemo.Hibernate.Entity.Customer;

public class DeleteCustomerDemo {

	public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
							  .addAnnotatedClass(Customer.class)
							  .buildSessionFactory();
                             
    Session session = factory.getCurrentSession();
    
    try {
    	
    	int customerId=1;
    	
    	session = factory.getCurrentSession();
    	session.beginTransaction();
    	
    	System.out.println("=====");
    	/*
    	System.out.println("Getting Customer with id "+customerId); 
    
    	Customer myCustomer = session.get(Customer.class, customerId);
    
    	System.out.println("Delete Customer with id "+customerId); 
    	//=====Singular Delete
    	session.delete(myCustomer);
    	*/
    	
    	
    	//=====Multiple Delete 
    	session.createQuery("delete from  Customer where id in (2,3)").executeUpdate();

    	
    	session.getTransaction().commit();

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



