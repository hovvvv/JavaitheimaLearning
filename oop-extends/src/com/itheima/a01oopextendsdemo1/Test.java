package com.itheima.a01oopextendsdemo1;

public class Test {
	public static void main(String[] args) {
		//创建对象并调用方法

		//1.创建布偶猫的对象
		Ragdoll rd = new Ragdoll();
		rd.eat();
		rd.drink();
		rd.catchMouse();

		System.out.println("--------------------------------------");

		//2.创建哈士奇对象
		Husky hs = new Husky();
		hs.eat();
		hs.drink();
		hs.gardHouse();
		hs.breakhome();


	}
}
