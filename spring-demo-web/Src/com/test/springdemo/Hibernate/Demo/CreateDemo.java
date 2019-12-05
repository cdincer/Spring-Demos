package com.test.springdemo.Hibernate.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.springdemo.Hibernate.Entity.Customer;
import com.test.springdemo.Hibernate.Entity.CustomerDetail;

public class CreateDemo {

	public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
							  .addAnnotatedClass(Customer.class)
							  .addAnnotatedClass(CustomerDetail.class)

							  .buildSessionFactory();
                             
    Session session = factory.getCurrentSession();
    
    try {
    	//use the session object so save Java object
    	System.out.println("Creating 3 new customers");
    	Customer tempCustomer1= new Customer("Paul","Walker","paul@walker.com");
    	Customer tempCustomer2= new Customer("Paul","Crawler","paul@crawler.com");
    	Customer tempCustomer3= new Customer("Paul","Flier","paul@flier.com");
    	Customer tempCustomer4= new Customer("Clancy","Brown","clancy@brown.com");
    	
    	
    	CustomerDetail tempCustDetail = new CustomerDetail("Walker@fb","Love Walking");
    	CustomerDetail tempCustDetail2 = new CustomerDetail("Crawler@fb","Love Crawling");
    	CustomerDetail tempCustDetail3 = new CustomerDetail("Flier@fb","Love Flying");
    	CustomerDetail tempCustDetail4 = new CustomerDetail("Clancy@fb","Socializing");

    	tempCustomer1.setCustomerDetail(tempCustDetail);
    	tempCustomer2.setCustomerDetail(tempCustDetail2);
    	tempCustomer3.setCustomerDetail(tempCustDetail3);
    	tempCustomer4.setCustomerDetail(tempCustDetail4);

    	
    	session.beginTransaction();
    	
    	System.out.println("Adding the customer");
    	session.save(tempCustomer1);
    	session.save(tempCustomer2);
    	session.save(tempCustomer3);
        session.save(tempCustomer4);
    	
    	
    	session.getTransaction().commit();
    	
    }
    finally {
    	factory.close();
    }
    
    
	}

}
