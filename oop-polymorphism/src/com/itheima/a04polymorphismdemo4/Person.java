package com.itheima.a04polymorphismdemo4;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*//饲养狗
	public void keepPet(Dog dog,String somenthing) {
		System.out.println("年龄为"+age+"的"+name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
		dog.eat(somenthing);
	}

	//饲养猫
	public void keepPet(Cat cat,String somenthing) {
		System.out.println("年龄为"+age+"的"+name+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
		cat.eat(somenthing);
	}*/

	public void keepPet(Animal a,String somenthing) {
		if (a instanceof Dog d){
			System.out.println("年龄为"+age+"的"+name+"养了一只"+d.getColor()+"颜色的"+d.getAge()+"岁的狗");
			d.eat(somenthing);
		} else if (a instanceof Cat c) {
			System.out.println("年龄为"+age+"的"+name+"养了一只"+c.getColor()+"颜色的"+c.getAge()+"岁的猫");
			c.eat(somenthing);
		}else {
			System.out.println("没有这种动物");
		}
	}

}
