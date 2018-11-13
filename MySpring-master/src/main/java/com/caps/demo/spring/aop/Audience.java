package com.caps.demo.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(** com.caps.demo.spring.aop.Performance.perform(..))")
	public  void performance() {}
	
	/*@Before("performance()")
	public void silentCellphones() {
		System.out.println("silent the phones");
	}

	@Before("performance()")
	public void takeSeats() {
		System.out.println("audience taking the seats");
	}
	
	@AfterReturning ("performance()")	
	public void applause() {
		System.out.println("clap...clap......clap....");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("give the money back... u asshole....");
	}
	*/
	/*@Before("execution(** com.caps.demo.spring.aop.Performance.perform(..))")
	public void silentCellphones() {
		System.out.println("silent the phones");
	}

	@Before("execution(** com.caps.demo.spring.aop.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("audience taking the seats");
	}
	
	@AfterReturning ("execution(** com.caps.demo.spring.aop.Performance.perform(..))")	
	public void applause() {
		System.out.println("clap...clap......clap....");
	}
	
	@AfterThrowing("execution(** com.caps.demo.spring.aop.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("give the money back... u asshole....");
	}*/
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		
		try {
			System.out.println("silencing the phonees");
			System.out.println("taking seats");
			jp.proceed();
			System.out.println("clap.....");
		} catch (Throwable e) {
			System.out.println("bugger give my money back");
		}
		
	}
}
