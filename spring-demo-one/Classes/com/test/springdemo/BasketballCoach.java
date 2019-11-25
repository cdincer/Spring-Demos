package com.test.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach
{
	
	private PerEval PerformanceEvaluation;
	
	@Autowired
	public BasketballCoach(PerEval EvaluationType)
	{
		PerformanceEvaluation = EvaluationType;
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
