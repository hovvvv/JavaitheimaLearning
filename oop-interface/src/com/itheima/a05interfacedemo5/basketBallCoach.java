package com.itheima.a05interfacedemo5;

public class basketBallCoach extends Coach{

	public basketBallCoach() {
	}

	public basketBallCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("篮球教练在教打篮球");
	}
}
