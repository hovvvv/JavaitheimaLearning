package com.itheima.a06bigIntegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
         /*
            public BigInteger add(BigInteger val)                   加法
            public BigInteger subtract(BigInteger val)              减法
            public BigInteger multiply(BigInteger val)              乘法
            public BigInteger divide(BigInteger val)                除法，获取商
            public BigInteger[] divideAndRemainder(BigInteger val)  除法，获取商和余数
            public boolean equals(Object x)                         比较是否相同
            public BigInteger pow(int exponent)                     次幂
            public BigInteger max/min(BigInteger val)               返回较大值/较小值
            public int intValue(BigInteger val)                     转为int类型整数，超出范围数据有误
        */

        //1.创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(2);

        //2.加法与除法
        BigInteger add = bd1.add(bd2);
        BigInteger divide = bd1.divide(bd2);
        /*System.out.println(add+", "+divide);*/

        //3.除法，获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        /*System.out.println(arr[0]);//商
        System.out.println(arr[1]);//余数*/

        //4.比较是否相同
        boolean result = bd1.equals(bd2);
        /*System.out.println(result);*/

        //5.次幂
        BigInteger bd4 = bd1.pow(2);
        /*System.out.println(bd4);*/

        //6.max:将大的值赋给bd5,不会产生新的BigInteger对象
        BigInteger bd5 = bd1.max(bd2);
        /*System.out.println(bd5);
        System.out.println(bd5 == bd1);//true
        System.out.println(bd5 == bd2);//false*/

        //7.转为int类型整数，超出范围数据有误
        //int 的最大数为:2147483647
        /*BigInteger bd6 = BigInteger.valueOf(2147483648L);
        int i = bd6.intValue();
        System.out.println(i);*/

        BigInteger bd6 = BigInteger.valueOf(200);
        double v = bd6.doubleValue();
        System.out.println(v);

    }
}
