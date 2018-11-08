package com.caps.dev.spring.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = 
    		   new AnnotationConfigApplicationContext(AppConfig.class);
       Person p = ctx.getBean(Person.class,"person");
       System.out.println(p.hashCode());
       
       p = ctx.getBean(Person.class,"person");
       System.out.println(p.hashCode());
       
       p = ctx.getBean(Person.class,"person");
       System.out.println(p.hashCode());
       
       p = ctx.getBean(Person.class,"person");
       System.out.println(p.hashCode());
      /* String[] beans=ctx.getBeanDefinitionNames();
       for (String string : beans) {
		System.out.println(string);
	}
       System.out.println("number of  beans: "+ctx.getBeanDefinitionCount());
       System.out.println(p.getName());
       p.getJob().job();*/
       ctx.close();
    }
}