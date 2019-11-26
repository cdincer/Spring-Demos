package com.test.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:eval.properties")
//@ComponentScan("com.test.springdemo")
public class SportsConfig {
	@Bean
	public PerEval QuarPerEvalCons() 
	{
		return new QuarPerEval();
	}
	
	@Bean 
	@Scope("singleton")
	public Coach swimCoachCons()
	{
		return new SwimCoach(QuarPerEvalCons());
	}

}
