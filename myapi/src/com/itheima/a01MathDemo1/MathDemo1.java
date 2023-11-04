package com.itheima.a01MathDemo1;

public class MathDemo1 {
    /*
            public static int           abs(int a)                    获取参数绝对值
            public static double        ceil(double a)                向上取整
            public static double        f1oor(double a)               向下取整
            public static int           round(float a)                四舍五入
            public static int           max(int a,int b)              获取两个int值中的较大值
            public static double        pow( double a, double b)      返回a的b次幂的值
            public static double        sqrt( double a)               返回a的平方根
            public static double        cbrt( double a)               返回a的立方根
            pub1ic static double        random( )                     返回值为double的随机值，范围[0.8,1.0)
     */
    public static void main(String[] args) {
        //abs 获取参数绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("============================我是分割线:)");
        //bug:
        //以int类型为例，取值范围： -2147483648 ~ 2147483647
        //如果没有正数与负数对应,那么传递负数结果有误
        //-2147483648 没有正数与之对应,所以abs结果产生bug
        //System.out.println(Math.abs(-2147483648));

        //解决办法：(jdk15 以后才有)
        //System.out.println(Math.absExact(-2147483648));

        //进一法  往数轴的正方向进一
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.54));
        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(-12.54));
        System.out.println("============================我是分割线:)");

        //去尾法
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-12.34));
        System.out.println(Math.floor(-12.54));
        System.out.println("============================我是分割线:)");

        //四舍五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));
        System.out.println("============================我是分割线:)");

        //获取两个整数的较大值
        System.out.println(Math.max(20,40));
        //获取两个整数的较小值
        System.out.println(Math.min(20,40));
        System.out.println("============================我是分割线:)");

        //获取a的b次幂
        System.out.println(Math.pow(2,3));
        //细节：
        //如果第二个参数 0 ~ 1之间的小数
        System.out.println(Math.pow(4,0.5));
        System.out.println(Math.pow(2,-2));
        //建议:
        //第二个参数:一般传递大于等于1的正整数.sqrt：开平方根，cbrt：开立方根
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));
        System.out.println("============================我是分割线:)");

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
            System.out.println(Math.floor(Math.random() * 100) + 1) ;
        }

    }
}
