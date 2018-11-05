package com.caps.dev.spring.autowired;

import org.springframework.stereotype.Component;

@Component
public class SoftwareDeveloper implements Job {
	public void job() {
		System.out.println("Codes Codes Codes");
	}
}