package com.caps.dev.spring.xml;

public class Engine {
	private String model;
	private String type;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + ", type=" + type + "]";
	}
}