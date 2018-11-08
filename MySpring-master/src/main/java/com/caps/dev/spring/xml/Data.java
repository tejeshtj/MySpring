package com.caps.dev.spring.xml;

public class Data {

	private String msg;
	private String count;
	private String random;
	
	@Override
	public String toString() {
		return "Data [msg=" + msg + ", count=" + count + ", random=" + random + "]";
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getRandom() {
		return random;
	}
	public void setRandom(String random) {
		this.random = random;
	}
	
}
