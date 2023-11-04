package com.itheima.a01MathDemo1;

import org.w3c.dom.ls.LSOutput;

public class MathDemo2 {
    public static void main(String[] args) {
        //判断一个数是否为一个质数
        //质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
        //如果为质数则返回true
        System.out.println(isPrime(13));
        System.out.println(isPrime(100));
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
