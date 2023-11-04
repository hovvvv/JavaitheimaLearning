package com.itheima.a01oopextendsdemo1;

//		1. Java只能单继承，不能多继承、但是可以多层继承。
//		2. Java中所有的类都直接或者间接继承于0bject类。
//		3.子类只能访问父类中非私有的成员
//		4.独立完成继承体系的案例

public class Animal {

	//权限修饰符:
	//prtvate:子类就无法访问了
	//私有:只能在本类中访问
	//爸爸的私房钱(自己能用)

	//注意事项:
	// 子类只能访问父类中非私有的成员

	public void eat() {
		System.out.println("吃东西");
	}

	public void drink() {
		System.out.println("喝水");
	}
}
