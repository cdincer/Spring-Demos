package com.test.springdemo;

public class CricketCoach implements Coach {

	private PerformanceAssessment PerAss;
	
	//No-argument constructor
	
	public CricketCoach()
	{
		System.out.println("No argument CricketCoach argument triggered");
	}
	
	//Setter method for CricketCoach
	public void setPerAss(PerformanceAssessment perAss) {
		System.out.println("setPerAss reached");
		PerAss = perAss;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice cricket for 15 minutes";
	}

	@Override
	public String getDailyPerformance() {
		return PerAss.getPerformance();
	}

}
