package spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigPassingArgumentWithTwoMethodsReturningSameReturnType {
	
	@Bean(name="person")
	public Person getPerson(@Qualifier("developer") Job job) {
		Person p = new Person();
		p.setName("Blake");
		p.setJob(job);
		return p;
	}
	
	@Bean(name="tester")
	public Job getJob1() {
		return new SoftwareTester();
	}
	@Bean(name="developer")
	public Job getJob2() {
		return new SoftwareDeveloper();
	}
}