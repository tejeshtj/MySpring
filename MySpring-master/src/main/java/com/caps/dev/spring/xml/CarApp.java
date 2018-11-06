package com.caps.dev.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp 
{
	public static void main( String[] args )
	{
				ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/carConfig.xml");
		Car car=ctx.getBean(Car.class);
		System.out.println(car.getName());
		System.out.println(car.getColor());
		System.out.println(car.getEngine());
		
		for(String bean:ctx.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
	}
}