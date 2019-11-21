package com.test.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyPerformance());
		
		System.out.println("====CricketCoachGetValues====Begin");
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		System.out.println("====CricketCoachGetValues====End");

		
		
		//close the context
		context.close();
	}

}
