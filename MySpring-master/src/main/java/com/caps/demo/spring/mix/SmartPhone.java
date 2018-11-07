package com.caps.demo.spring.mix;

public class SmartPhone {
	private String name;
	private String color;
	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", color=" + color + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
