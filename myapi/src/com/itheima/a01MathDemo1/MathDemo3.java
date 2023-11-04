package com.itheima.a01MathDemo1;

public class MathDemo3 {
    public static void main(String[] args) {
        //自幂数是指一个 n 位数，它的每个位上的数字的 n 次幂之和等于它本身。（例如：当n为3时，有1^3 + 5^3 + 3^3 = 153，153即是n为3时的一个自幂数）
        //要求一：统计一共有多少个水仙花数。
        //要求二：判断一下为什么没有两位自幂数。
        //要求三：统计一共有多少个四叶玫瑰数，五角星数。

        //水仙花数： 100 ~ 999
        int count = 0;

        for (int i = 100; i < 999; i++) {
            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //判断
            //每一位的三次方之和 跟本身 进行比较。
            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if (sum == i){
                count++;
                System.out.println(i);
            }
        }
    }
}
