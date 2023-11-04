package com.itheima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
    //目标：掌握带参数方法定义的格式和调用的格式
        getsum(10,20);//10，20为实参
    }

    public static void getsum(int num1,int num2){//int num1，num2为形参
        int result = num1 + num2;
        System.out.println(result);
    }

}
