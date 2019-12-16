package com.springdemo.base.Aspect;

import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springdemo.Hibernate.Entity.EventTracker;



@Aspect
@Component

public class CRMLoggingAspect {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Logger myLogger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.springdemo.base.controller.*.*(..))")
	private void forControllerPackage()
	{}
	
	@Pointcut("execution(* com.springdemo.base.service.*.*(..))")
	private void forServicePackage()
	{}
	
	@Pointcut("execution(* com.springdemo.base.dao.*.*(..))")
	private void forDaoPackage()
	{}
	
	
	@Pointcut("forControllerPackage()||forServicePackage()||forDaoPackage()")
	private void forAppFlow()
	{}
	
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint)
	{
		String theMethod = theJoinPoint.getSignature().toShortString();
		
		myLogger.info("====>> in @Before:calling method:" + theMethod);
		
		Object[] args = theJoinPoint.getArgs();
		
		for(Object tempArg : args)
		{
			myLogger.info("====>> argument:" + tempArg);		}
	    }
	
	
	@AfterReturning(
			pointcut="forAppFlow()",
			returning="theResult"
			)
	public void afterReturning(JoinPoint theJoinPoint,Object theResult)
	{
		//display method we are returning from
		String theMethod = theJoinPoint.getSignature().toShortString();
		
		myLogger.info("===> in @AfterReturning:from method: " + theMethod);
		// display data returned
		
		
		myLogger.info("===> result: " + theResult);
	}
	
	

}
