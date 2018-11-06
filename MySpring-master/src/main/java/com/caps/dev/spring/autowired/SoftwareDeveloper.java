package com.caps.dev.spring.autowired;

import org.springframework.stereotype.Component;

@Component 
//@Primary this help is selecting this component for autowiring
public class SoftwareDeveloper implements Job {
	public void job() {
		System.out.println("Codes Codes Codes");
	}
}