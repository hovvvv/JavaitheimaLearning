package com.itheima.a02abstractdemo2;

public abstract class Goat extends Animal{

	public Goat() {
	}

	public Goat(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat(){
		System.out.println("山羊在吃草");
	}
}
