package com.caps.demo.spring.mix2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/BookConfig.xml");
		
		for(String bean:ctx.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
		ctx.close();
	}
}
