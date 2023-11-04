package com.itheima.a06bigIntegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*public BigInteger(int num, Random rnd)      获取随机大整数,范围:[0 ~ 2 的num次方-1]
          public BigInteger(String val)               获取指定的大整数
          public BigInteger(String val, int radix)    获取指定进制的大整数

          public static BigInteger valueOf(long val)  静态方法获取BigInteger的对象,内部有优化
        细节:
                对象一旦创建里面的数据不能发生改变.
        */

        //1.获取一个随机大整数
        /*Random r = new Random();
        for (int i = 0; i < 100; i++) {
            BigInteger bd1 = new BigInteger(4, r);
            System.out.println(bd1);
        }*/

        //2.获取一个指定的大整数
        //细节:字符串中必须是整数,否则会报错
        /*BigInteger bd2 = new BigInteger("11111111111");
        System.out.println(bd2);*/

        /*BigInteger bd2 = new BigInteger("1.1");
        System.out.println(bd2);*/

        /*BigInteger bd3 = new BigInteger("abc");
        System.out.println(bd3);*/

        //3.获取指定进制的大整数
        //细节:字符串数字必须是整数,字符串数字必须跟进制吻合
        // radix表示:进制
        /*BigInteger bd4 = new BigInteger("100", 2);
        System.out.println(bd4);*/

        //4.静态方法获取BigInteger的对象,内部有优化
        //细节:
        //1.能表示范围比较小,只能在long的取值范围之内,如果超出long的范围就不行了.
        //2.在内部对常用的数字:-16 ~ 16进行了优化.
        // 提前把-16 ~ 16 先创建好BigInteger的对象,如果多次获取不会重写创建新的.
//        BigInteger bd5 = BigInteger.valueOf(16);
//        BigInteger bd6 = BigInteger.valueOf(16);

        //==比较的是地址值
        //如果为true则地址值一样,为同一个对象
//        System.out.println(bd5 == bd6 );


        //打印long的最大值
        //System.out.println(Long.MAX_VALUE);

        //5.对象一旦创建内部的数据不能发生改变
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        BigInteger result = bd9.add(bd10);
        System.out.println(result);
        //此时，不会修改参与计算的BigInteger对象中的借，而是产生了一个新的BigInteger对象记录
    }
}
