package com.itheima.a05interfacedemo5;

public class tableTennisCoach extends Coach implements speakEnglish{


	public tableTennisCoach() {
	}

	public tableTennisCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		System.out.println("乒乓球教练在教打乒乓球");
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球教练在说英语");
	}
}
