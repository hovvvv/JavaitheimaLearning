package com.itheima.a04staticdemo4;

/*
public:被JVM调用，访问权限足够大
static:被JVM调用，不用创建对象，直接类名访问
		因为main方法是静态，所以测试类中的其他方法也需要是静态的
void  :被JVM调用，不需要给JVM返回值
main  :一个通用的名称，虽然不是关键字，但是被JVM识别
String[] args:以前用于接受键盘录入的数据，现在没用
 */

public class StudentTest {
	public static void main(String[] args) {
	Student.teacherName = "阿炜老师";
		//1.创建第一个学生对象
		Student s1 = new Student();
		System.out.println("s1:" + s1);
		s1.name = "zhangsan";
		s1.age = 23;
		s1.show1();

		System.out.println("======================================");

		Student s2 = new Student();
		System.out.println("s2:" + s2);
		s2.name = "lisi";
		s2.age = 24;
		s2.show1();
	}
}
