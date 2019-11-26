package com.test.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BasketballCoach implements Coach
{
	@Autowired
	@Qualifier("dailyPerEval")
	private PerEval PerformanceEvaluation;
	
	public BasketballCoach()
	{
		System.out.println("<<No Arg Default Constructor");
	}
	

	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 10 minutes doing suicide drills";
	}

	@Override
	public String getDailyPerformance() {
		return "BasketBall Player performance was adequate today";
	}

	@Override
	public String getRandomAttributeReport() {
		return PerformanceEvaluation.getRandomStatEvaluation();
	}

}
