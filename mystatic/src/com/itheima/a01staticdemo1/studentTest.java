package com.itheima.a01staticdemo1;

/*
* 关于 static 关键字的使用，它可以用来修饰的成员变量和成员方法，
* 被static修饰的成员是属于类的是放在静态区中，
* 没有static修饰的成员变量和方法则是属于对象的。
* 我们上面案例中的成员变量都是没有static修饰的，所以属于每个对象。
*
* 调用方式：
* 		类名调用（推荐）
* 		对象名调用
* */


public class studentTest {
	public static void main(String[] args) {
		Student.teacherName = "阿炜老师";
		//1.创建第一个学生对象
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(22);
		s1.setGender("男");
//		s1.teacherName = "阿炜老师";

		s1.study();
		s1.show();

		//2.创建第二个学生对象
		Student s2 = new Student();
		s2.setName("翠花");
		s2.setAge(11);
		s2.setGender("女");

		s2.study();
		s2.show();
	}
}
