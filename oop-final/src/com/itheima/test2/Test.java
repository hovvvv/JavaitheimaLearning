package com.itheima.test2;

public class Test {
	public static void main(String[] args) {
		/*
			final修改基本数据类型:记录的值不能发生改变
			final修饰引用数据类型:记录的地址值不能发生改变，内部的属性值还是可以改变的

			核心：
				常量记录的数据不发生改变。

			字符串不可变

		 */

		final double PI = 3.14;

		//创建对象
		final Student s = new Student("zhangsan",24);
		s.setName("王五");
		s.setAge(21);
		System.out.println(s.getName() + "," + s.getAge());

		//数组
		final int[] ARR = {1,2,3,4,5};
		//ARR = new int[10];
		ARR[0] = 10;
		ARR[1] = 20;

		//遍历数组
		for (int i = 0; i < ARR.length; i++) {
			System.out.println(ARR[i]);
		}
	}
}
