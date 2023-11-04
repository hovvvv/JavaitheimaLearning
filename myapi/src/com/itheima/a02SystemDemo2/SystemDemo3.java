package com.itheima.a02SystemDemo2;

public class SystemDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        Student[] arr1 = {s1,s2,s3};
        Person[] arr2 = new Person[3];
        //把arr1中的对象的地址值赋值给arr2中
        System.arraycopy(arr1,0,arr2,0,3);

        //遍历数组arr2
        for (int i = 0; i < arr2.length; i++) {
           Student stu = (Student) arr2[i];
            System.out.println(stu.getName()+", "+ stu.getAge());
        }
    }
}

class Person{
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
}

class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
