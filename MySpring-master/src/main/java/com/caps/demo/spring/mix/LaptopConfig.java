package com.caps.demo.spring.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaptopConfig {
	
	@Bean(name="laptop")
	public Laptop getLaptop() {
		Laptop l = new Laptop();
		l.setModel("Z70");
		l.setName("Lenovo");
		return l;
	}
}
