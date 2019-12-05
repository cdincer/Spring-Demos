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


 

    	
    	session.beginTransaction();
    	
    	//Main table 14,15,16,17
    	int[] theId= {13,14,15,16};
    	
    	for(int var : theId )
    	{
        	CustomerDetail tempCustomerDetail=session.get(CustomerDetail.class, var);

         if(tempCustomerDetail != null)
           {
         		tempCustomerDetail.getCustomer().setCustomerDetail(null);
            System.out.println("Deleting customer "+theId);
        	session.delete(tempCustomerDetail);
           }
        	
    	}
    	
   

    	
    	
    	session.getTransaction().commit();
    	
    	
    	/*Opening a new session
    	session=factory.openSession();
    	session.beginTransaction();


    	session.getTransaction().commit();
       Closing a new session */
    	
    }
    finally {
    	factory.close();
    }
    
    
	}

}
