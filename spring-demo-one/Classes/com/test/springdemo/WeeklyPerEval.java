package com.test.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WeeklyPerEval implements PerEval {

	String[] ReceivedValues = {"w--Strength","w--Perception","w--Endurance","w--Coolness","w--Intelligence","w--Agility"};

	public WeeklyPerEval()
	{
		System.out.println("Inside WeeklyPerEval construct");
		
	}
	
	
	
	@Override
	public String getPerEvaluation() {
		// TODO Auto-generated method stub
		return "This is the Weekly Evaluation";
	}

	@Override
	public String getRandomStatEvaluation() {
		Random Rand = new Random();

		String Stat= ReceivedValues[Rand.nextInt(ReceivedValues.length)];
		return "Athletes Weekly "+Stat+" was great";	}
	


}
