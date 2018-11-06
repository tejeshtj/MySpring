package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigPassingArgument {
	
	@Bean(name="person")
	public Person getPerson(Job job) {
		Person p = new Person();
		p.setName("Blake");
		p.setJob(job);
		return p;
	}
	
	@Bean
	public Job getJob() {
		return new SoftwareTester();
	}
}