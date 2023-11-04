package com.itheima.a05interfacedemo5;

public abstract class Athletes extends Person{
	public Athletes() {
	}

	public Athletes(String name, int age) {
		super(name, age);
	}

	public abstract void learn();
}
