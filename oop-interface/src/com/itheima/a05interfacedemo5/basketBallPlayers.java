package com.itheima.a05interfacedemo5;

public class basketBallPlayers extends Athletes{

	public basketBallPlayers() {
	}

	public basketBallPlayers(String name, int age) {
		super(name, age);
	}

	@Override
	public void learn() {
		System.out.println("篮球运动员在学习打篮球");
	}
}
