package com.itheima.a07interfacedemo7;

public interface Inter {
	/*
	接口中静态方法的定义格式:
		格式: public static 返回值类型方法名(参数列表) { }
		范例: public static void show() { }

	接口中静态方法的注意事项:
		静态方法，只能通过接口名调用，不能通过实现类名或者对象名调用
		public可以省略，static不能省略
 */

	public abstract void method();

	public static void show(){
		System.out.println("Inter接口中的静态方法------show");
	}
}
