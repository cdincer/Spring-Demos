package com.test.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
			
		Coach theCoach= context.getBean("basketballCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyPerformance());
		System.out.println(theCoach.getRandomAttributeReport());
		
		context.close();

	}

}
