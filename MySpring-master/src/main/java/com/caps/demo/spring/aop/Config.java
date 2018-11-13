package com.caps.demo.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {
	
	@Bean
	public Audience audience() {
		return new Audience();
	}
	
	@Bean(name="singing")
	public Performance performance() {
		return new SingingPerformance();
	}
	
	@Bean(name="disk")
	public BlankDisc blankDisc() {
		return new BlankDisc();
	}
	
	@Bean
	public TrackCounter counter() {
		return new TrackCounter();
	}

}
