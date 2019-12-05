package com.test.springdemo.Hibernate.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.springdemo.Hibernate.Entity.Customer;
import com.test.springdemo.Hibernate.Entity.CustomerDetail;

public class DeleteDemo {

	public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
							  .addAnnotatedClass(Customer.class)
							  .addAnnotatedClass(CustomerDetail.class)

							  .buildSessionFactory();
                             
    Session session = factory.getCurrentSession();
    
    try {
    	//use the session object so save Java object
    	System.out.println("Creating 3 new customers");


 

    	
    	session.beginTransaction();
    	
    	int[] theId= {5,6,7};
    	
    	for(int var : theId )
    	{
        	Customer tempCustomer=session.get(Customer.class, var);

         	if(tempCustomer != null)
        	{
        		System.out.println("Deleting instructor "+theId);
        	session.delete(tempCustomer);
        	}
        	
    	}
    	
   

    	
    	
    	session.getTransaction().commit();
    	
    	
    	//Opening a new session
    	session=factory.openSession();
    	session.beginTransaction();


    	session.getTransaction().commit();
        //Closing a new session
    	
    }
    finally {
    	factory.close();
    }
    
    
	}

}
