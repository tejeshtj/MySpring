package com.caps.dev.java;

public class App {

	public static void main(String[] args) {
		
		Person person=new Person();
		
		person.setName("tejesh");
		person.setJob(new SoftwareDeveloper());
		
		System.out.println(person.getName());
		person.getJob().job();
		
	}
}
