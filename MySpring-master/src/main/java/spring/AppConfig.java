package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name="person")
	
	public Person getPerson() {
		Person p = new Person();
		p.setName("Blake");
		p.setJob(getJob());
		return p;
	}
	
	@Bean
	public Job getJob() {
		return new SoftwareTester();
	}
}