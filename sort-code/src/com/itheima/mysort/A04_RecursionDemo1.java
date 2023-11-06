package com.itheima.mysort;

public class A04_RecursionDemo1 {

//    递归要有出口,否则就会出现内存溢出

    public static void main(String[] args) {
        method();
    }


    public static void method(){
        method();
    }
}

