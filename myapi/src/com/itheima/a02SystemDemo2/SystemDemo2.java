package com.itheima.a02SystemDemo2;

public class SystemDemo2 {
    public static void main(String[] args) {
        //判断1 ~ 10000之间有多少质数
        long start = System.currentTimeMillis();

        for (int i = 1; i < 100000; i++) {
            boolean flag = isPrime2(i);
            if (flag) {
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //以前的方式判断
    private static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //改进后的方法 ---- 效率高
    private static boolean isPrime2(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
