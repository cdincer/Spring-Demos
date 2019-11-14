package com.test.springdemo;

public class BaseballCoach implements Coach{
	
	// define a private field for the dependency
	private PerformanceAssessment PerformanceReport;
	
	public BaseballCoach(PerformanceAssessment BaseBallDailyPerService)
	{
		PerformanceReport=BaseBallDailyPerService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyPerformance() {
		// 
		return PerformanceReport.getPerformance();
	}

}
