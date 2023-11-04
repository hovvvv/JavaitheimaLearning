package com.itheima.a010oopextendsdemo10.javabean;

public class Test {
	public static void main(String[] args) {
		//创建对象并赋值调用
		Manager m = new Manager("heima001","张三",15000,15000);
		System.out.println(m.getId()+", " +m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
		m.work();
		m.eat();

		System.out.println("=============================================");

		Chef c = new Chef();
		c.setId("heima002");
		c.setName("李四");
		c.setSalary(8000);
		System.out.println(c.getId()+", " + c.getName() + ", " + c.getSalary());
		c.work();
		c.eat();


	}
}
