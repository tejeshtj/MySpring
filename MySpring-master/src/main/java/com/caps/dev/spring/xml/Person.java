package com.caps.dev.spring.xml;

public class Person {
	private String name;
	private Job job;

	
	public Person(String name, Job job) {  //this is parametrized constructor we dont have default constructor so property tag wont work
										//if we dont have field constructor wecan use property tag
		this.name = name;
		this.job = job;
	}

	public void init() {
		System.out.println("Init");
	}

	public void destory() {
		System.out.println("Destroy");
	}

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