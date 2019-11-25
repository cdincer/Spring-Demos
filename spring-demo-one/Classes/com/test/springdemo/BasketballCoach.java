package com.test.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach
{
	
	private PerEval PerformanceEvaluation;
	
	public BasketballCoach()
	{
		System.out.println("<<No Arg Default Constructor");
	}
	
	/*
	public BasketballCoach(PerEval EvaluationType)
	{
		PerformanceEvaluation = EvaluationType;
	}
	*/
	
	
	//Setter method
	
	@Autowired
	public void setEvalType(PerEval EvaluationType)
	{
		PerformanceEvaluation = EvaluationType;
		System.out.println("<<Auto Wired SetEvalType");
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
