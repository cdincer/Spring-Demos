package com.test.springdemo.Hibernate.Demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.springdemo.Hibernate.Entity.Customer;

public class ReadCustomerDemo {

	public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
							  .addAnnotatedClass(Customer.class)
							  .buildSessionFactory();
                             
    Session session = factory.getCurrentSession();
    
    try {
    	session.beginTransaction();
    	
    	//query students
    	List<Customer> theCustomers = session.createQuery("from Customer").getResultList();
    	
    	displayCustomers(theCustomers);
    	
    	System.out.println("=======");
    	System.out.println("Searching for Browns");
    	theCustomers = session.createQuery("from Customer s where s.lastName='Brown'").getResultList();    	
       	displayCustomers(theCustomers);
    	
    	System.out.println("=======");
    	System.out.println("Searching for Browns or Walker1");
       	theCustomers = session.createQuery("from Customer s where s.lastName='Walker1' or s.firstName='Clancy'").getResultList();
        displayCustomers(theCustomers);
        
       	System.out.println("=======");
    	System.out.println("Searching for Emails LIKE paul@");
       	theCustomers = session.createQuery("from Customer s where s.email LIKE '%paul@%'").getResultList();
        displayCustomers(theCustomers);

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



/*Read Start Old/Singular
session = factory.getCurrentSession();
session.beginTransaction();

System.out.println("Getting customer with id: "+ tempCustomer1.getId());
Customer myCustomer = session.get(Customer.class, tempCustomer1.getId());
System.out.println("Getting customer complete:" +myCustomer);


session.getTransaction().commit();
Read End*/