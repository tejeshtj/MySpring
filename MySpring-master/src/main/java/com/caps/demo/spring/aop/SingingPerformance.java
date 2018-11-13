package com.caps.demo.spring.aop;

public class SingingPerformance implements Performance  {

	@Override
	public void perform() {
		System.out.println("start singling...");
		/*int i=2/0;*/
		System.out.println("end singing......");
	}

}
