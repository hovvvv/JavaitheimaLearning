package com.itheima.a05interfacedemo5;

public class Test {
	public static void main(String[] args) {
		tableTennisPlayers ttp = new tableTennisPlayers("马龙",29);
		System.out.println(ttp.getName()+", "+ttp.getAge());

		ttp.learn();
		ttp.speakEnglish();

		System.out.println("===============================================");

		basketBallPlayers bbp = new basketBallPlayers("蔡徐坤",18);
		System.out.println(bbp.getName()+", " + bbp.getAge());

		bbp.learn();

	}
}
