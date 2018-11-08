package com.caps.dev.spring.autowired;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name="Blake";
//	@Autowired --this is similar to inject
	@Inject  @Qualifier("softwareDeveloper")// qualifier helps in selecting a component to which it should be autowired with ,if we are having
	
	//two components that return the sam kind of object. and another way is to give @primary  to the component you want to wire with
	private Job job;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
}