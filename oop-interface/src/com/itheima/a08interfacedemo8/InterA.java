package com.itheima.a08interfacedemo8;

//JDK9：接口中可以定义私有方法

public interface InterA {
	public default void show1(){
		System.out.println("show1开始执行了");
		show3();
	}

	public static void show2(){
		System.out.println("show2开始执行了");
		show4();
	}

	//普通的私有方法，给默认方法服务
	private void show3(){
		System.out.println("记录程序在运行过程中的各个细节，这里有100行代码");
	}

	//静态的私有方法，给静态方法服务
	private static void show4(){
		System.out.println("记录程序在运行过程中的各个细节，这里有100行代码");
	}
}
