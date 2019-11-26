package com.test.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {


	AnnotationConfigApplicationContext context = 
    new AnnotationConfigApplicationContext(SportsConfig.class);
	SwimCoach theCoach= context.getBean("swimCoachCons",SwimCoach.class);
	

	
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyPerformance());
	System.out.println(theCoach.getRandomAttributeReport());
	System.out.println(theCoach.getCoachEmail());
	System.out.println(theCoach.getCoachName());

		
		context.close();

	}

}
