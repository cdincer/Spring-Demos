package com.test.springdemo;

import java.util.Random;

public class DailyPerService implements PerformanceAssessment {

	@Override
	public String getPerformance() {
		return "Athletes Performance was adequate today";
	}

	@Override
	public String RandomDailyAttributeReport() {
		// TODO Auto-generated method stub
		String AttributeReturn="";
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(6) ;
		//So We can get a random number instead of something completely weird.
		String[] RandomAttribute = {"Strength","Perception","Endurance","Leadership","Intelligence","Agility"};
		
		AttributeReturn = RandomAttribute[randomInt];
		
		
		
		return AttributeReturn;
	}

}
