package com.itheima.a04staticdemo4;

public class Student {

	/*
	总结：
		静态方法中没有this关键字
		静态方法中，只能访问静态
		非静态方法可以访问所有
	 */
	String name;
	int age;
	static String teacherName;


	//	this出现在实例方法中，谁调用这个方法（哪个对象调用这个方法），this就代表谁（this就代表哪个对象）。
	public void show1(Student this) {
		System.out.println("this" + this);
		System.out.println(this.name + ", " + this.age +", " + this.teacherName);

		//调用其他方法
		this.show2();
		this.method();
	}

	public void show2() {
		System.out.println("show2");
	}

	public static void method() {
		System.out.println("静态方法");
	}
}
