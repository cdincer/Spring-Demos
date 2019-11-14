package com.test.springdemo;

public class DailyPerService implements PerformanceAssessment {

	@Override
	public String getPerformance() {
		return "Athlets Performance was adequate today";
	}

}
