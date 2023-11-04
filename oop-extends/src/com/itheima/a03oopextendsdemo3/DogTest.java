package com.itheima.a03oopextendsdemo3;

public class DogTest {
	public static void main(String[] args) {
		Husky h = new Husky();
		h.eat();
		h.drink();
		h.gardHouse();
		h.breakHome();

		System.out.println("===========================================");

		ChineseRuralDog c = new ChineseRuralDog();
		c.eat();
		c.drink();
		c.gardHouse();

		System.out.println("===========================================");

		sharpiDog s = new sharpiDog();
		s.eat();
		s.drink();
		s.gardHouse();
	}
}
