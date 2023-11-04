package com.itheima.a01abstractdemo1;

import org.w3c.dom.ls.LSOutput;

public class Test {
	//抽象类不能创建对象
	//子类必须重写父类里所有的抽象方法
	public static void main(String[] args) {
		Student s = new Student("zhangsan",23);
		System.out.println(s.getName()+", "+s.getAge());
	}

}
