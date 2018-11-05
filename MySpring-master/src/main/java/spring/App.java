package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = 
    		   new AnnotationConfigApplicationContext(AppConfig.class);
       Person p = ctx.getBean(Person.class,"person");
       
       System.out.println(p.getName());
       p.getJob().job();
    }
}