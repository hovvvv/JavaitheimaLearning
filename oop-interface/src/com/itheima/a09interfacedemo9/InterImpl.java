package com.itheima.a09interfacedemo9;

public class InterImpl extends InterAdapter{
	//InterAdapter：（适配器）设计模式
	//需要用到哪个方法，就去重写哪个方法
	@Override
	public void method5(){
		System.out.println("只要用到第五个方法");
	}
}
