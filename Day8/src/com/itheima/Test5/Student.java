package com.itheima.Test5;

public class Student {
    /*构造方法格式
    *public class student{
    * 修饰符 类名（参数）{
    *           方法体;
    *  }
    * }
    *
    * 构造方法概述（作用）：创造对象的时候，
    * 、虚拟机会自动调用构造方法，作用是给成员变量进行初始化的。
    *
    */
    private String name;
    private int age;

    //如果我们没有写任何的构造方法
    //那么虚拟机给我们加一个空参构造方法
    public Student(){
        System.out.println("看看我执行了吗？");
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
            this.name = name;
    }
    public String getName() {
        return name;
        }

    public void setAge ( int age) {
        this.age = age;
    }

        public int getAge() {
            return age;
        }
}
