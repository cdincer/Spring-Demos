package com.test.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MonthlyPerEval implements PerEval {

	@Override
	public String getPerEvaluation() {
		return "Monthly Evaluation Received For Athlete";
	}

	@Override
	public String getRandomStatEvaluation() {
		Random Rand = new Random();
		String Stat="";
		String[] Stats= {"D--Strength","D--Perception","D--Endurance","D--Coolness","D--Intelligence","D--Agility"};
		
		Stat= Stats[Rand.nextInt(6)];
		return "Athletes Monthly "+Stat+" was great";
	}

}