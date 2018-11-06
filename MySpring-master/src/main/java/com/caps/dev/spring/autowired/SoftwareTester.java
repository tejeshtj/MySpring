package com.caps.dev.spring.autowired;

import org.springframework.stereotype.Component;

@Component
public class SoftwareTester implements Job {
	public void job() {
		System.out.println("Test test test");
	}
}