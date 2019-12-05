package com.test.springdemo.Hibernate.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.springdemo.Hibernate.Entity.Customer;
import com.test.springdemo.Hibernate.Entity.CustomerDetail;

public class GetCustomerDetail {

	public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
							  .addAnnotatedClass(Customer.class)
							  .addAnnotatedClass(CustomerDetail.class)

							  .buildSessionFactory();
                             
    Session session = factory.getCurrentSession();
    
    try {

    	session.beginTransaction();
    	
    	int theId= 1;
    	
    	CustomerDetail TempCustomerDetail = session.get(CustomerDetail.class, theId);
   

    	System.out.println("TempCustomerDetail fetched" + TempCustomerDetail);
    	System.out.println("TempCustomerDetail fetched" + TempCustomerDetail.getCustomer());

    	
    	session.getTransaction().commit();
    	
    	
    	/*Opening a new session
    	session=factory.openSession();
    	session.beginTransaction();


    	session.getTransaction().commit();
        Closing a new session*/
    	
    }
    catch(Exception exc)
    {
    	exc.printStackTrace();
    }
    
    finally {
    	session.close();
    	
    	factory.close();
    }
    
    
	}

}
