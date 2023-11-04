package com.itheima.a03innerclassdemo3;

/*
        this关键字的意义
                1、代表当前对象

                2、this就是所在函数所属对象的引用，简单来说，哪个对象调用了this所在的函数，this就代表哪个对象
*/
public class Test {
    public static void main(String[] args) {
        //创建内部类的对象，并调用show方法
        Outer.Inner oi = new Outer().new Inner();

        oi.show();
    }
}
