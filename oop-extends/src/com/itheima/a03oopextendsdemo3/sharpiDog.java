package com.itheima.a03oopextendsdemo3;

public class sharpiDog extends Dog{
	@Override
	public void eat(){
		super.eat();//吃狗粮
		System.out.println("沙皮狗在吃骨头");
	}
}
