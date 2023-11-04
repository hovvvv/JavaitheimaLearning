package com.itheima.a010oopextendsdemo10.javabean;

public class Manager extends Employee{

	private double bonus;

	//空参构造
	public Manager() {
	}

	//带全部参数的构造
	//父类+子类
	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("经理在管理其他人");
	}
}
