package com.itheima.a05interfacedemo5;

public class tableTennisPlayers extends Athletes implements speakEnglish{

	public tableTennisPlayers() {
	}

	public tableTennisPlayers(String name, int age) {
		super(name, age);
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球运动员在说英语");
	}

	@Override
	public void learn() {
		System.out.println("乒乓球运动员在学习打乒乓球");
	}


}
