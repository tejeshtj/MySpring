package com.caps.dev.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/PersonConfig.xml");
		Data p = ctx.getBean(Data.class,"data");

		System.out.println(p);
		/*p.getJob().job();
		for(String bean:ctx.getBeanDefinitionNames()) {
			System.out.println(bean);
		}*/
	}
}