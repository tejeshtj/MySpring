package com.caps.demo.spring.mix;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(PersonConfig.class);
		
		for(String bean: ctx.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
		
		ctx.close();
	}
}
