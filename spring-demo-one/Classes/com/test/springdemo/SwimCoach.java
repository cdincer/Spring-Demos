package com.test.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private PerEval SwimEval;
	
	@Value("${foo.coachname}")
	private String CoachName;	
	
	@Value("${foo.email}")
	private String CoachEmail;
	
	public String getCoachName() {
		return CoachName;
	}


	public String getCoachEmail() {
		return CoachEmail;
	}
	
	public SwimCoach(PerEval RetrievedEval)
	{
		SwimEval = RetrievedEval;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swimmer Daily Practice-1";
	}

	@Override
	public String getDailyPerformance() {
		// TODO Auto-generated method stub
		return SwimEval.getPerEvaluation();
	}

	@Override
	public String getRandomAttributeReport() {
		// TODO Auto-generated method stub
		return SwimEval.getRandomStatEvaluation();
	}

}
