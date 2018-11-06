package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = 
    		   new AnnotationConfigApplicationContext(AppConfig.class);
       Person p = ctx.getBean(Person.class,"person");
       
       System.out.println(p.getName());
       p.getJob().job();
       
       for(String bean:ctx.getBeanDefinitionNames()) {
    	   System.out.println(bean);
       }
       ctx.close();
    }
}