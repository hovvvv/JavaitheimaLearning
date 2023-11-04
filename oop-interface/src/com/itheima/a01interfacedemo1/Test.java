package com.itheima.a01interfacedemo1;

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog("小黄",3);
		System.out.println(d.getName()+", "+d.getAge());

		d.eat();
		d.swim();


		System.out.println("=====================================");

		Rabbit r = new Rabbit("小白",1);
		System.out.println(d.getName()+", "+d.getAge());

		r.eat();
	}
}
