package com.test.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
			
		//Two Coaches for testing bean lifecycle
		Coach theCoach= context.getBean("basketballCoach",Coach.class);
		
		Coach TestCoach= context.getBean("basketballCoach",Coach.class);

		boolean result = (theCoach == TestCoach);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyPerformance());
		System.out.println(theCoach.getRandomAttributeReport());
		
		System.out.println("Do Two Coaches point at the same object:"+result+"?");	
		System.out.println("Coach Location:"+theCoach);
		System.out.println("Coach Location:"+TestCoach);

		
		context.close();

	}

}
