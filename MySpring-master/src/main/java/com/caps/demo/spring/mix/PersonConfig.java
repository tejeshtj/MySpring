package com.caps.demo.spring.mix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(LaptopConfig.class)
@ImportResource("classpath:penConfig.xml")
public class PersonConfig {
	
	@Autowired
	Laptop l;
	
	@Autowired
	Pen pen;
	
	@Bean(name="person")
	public Person getPerson() {
		Person p =  new Person();
		p.setName("Blake");
		
		p.setPen(pen);
		p.setLaptop(l);
		return p;
	}
	
	@Bean(name="book2")
	public Book getBook() {
		Book b = new Book();
		b.setName("Head First Java");
		b.setSubject("Java");
		return b;
	}
}
