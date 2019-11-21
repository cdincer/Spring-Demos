package com.test.springdemo;

public class CricketCoach implements Coach {

	private PerformanceAssessment PerAss;
	
	//No-argument constructor
	private String emailAddress;
	private String team;
	
	public CricketCoach()
	{
		System.out.println("No argument CricketCoach argument triggered");
		
	}
	
	//Email and Team getter setter block begin
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach email assigned :"+ emailAddress);
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoaches team name assigned :"+team);
		this.team = team;
	}
	//Email and Team getter setter block end

	public CricketCoach(PerformanceAssessment performanceReport) {
		super();
		PerAss = performanceReport;
	}
	
	
	//Setter method for CricketCoach
	public void setPerAss(PerformanceAssessment perAss) {
		System.out.println("setPerAss reached");
		this.PerAss = perAss;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice cricket for 15 minutes";
	}

	@Override
	public String getDailyPerformance() {
		return PerAss.getPerformance();
	}

}
