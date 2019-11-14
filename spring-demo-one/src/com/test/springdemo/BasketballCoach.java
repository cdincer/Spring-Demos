package com.test.springdemo;

public class BasketballCoach implements Coach
{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 10 minutes doing suicide drills";
	}

	@Override
	public String getDailyPerformance() {
		// TODO Auto-generated method stub
		return "BasketBall Player performance was adequate today";
	}

}
