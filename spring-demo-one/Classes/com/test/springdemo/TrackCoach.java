package com.test.springdemo;

public class TrackCoach implements Coach {
	private PerformanceAssessment PerformanceReport;
	

	public TrackCoach(PerformanceAssessment performanceReport) {
		super();
		PerformanceReport = performanceReport;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily run 30 minutes,Track Coach task";
	}

	@Override
	public String getDailyPerformance() {
		// TODO Auto-generated method stub
		return "Just Do It "+PerformanceReport.getPerformance();
	}

	@Override
	public String getRandomAttributeReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
