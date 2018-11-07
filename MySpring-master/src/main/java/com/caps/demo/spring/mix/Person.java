package com.caps.demo.spring.mix;

public class Person {
	private String name;
	private Laptop laptop;
	private Pen pen;
	private SmartPhone smartPhone;
	@Override
	public String toString() {
		return "Person [name=" + name + ", laptop=" + laptop + ", pen=" + pen + ", smartPhone=" + smartPhone + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	
}
