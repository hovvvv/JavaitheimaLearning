package com.itheima.mysort;

public class A04_RecursionDemo3 {
    public static void main(String[] args) {
        //需求：利用递归求5的阶乘
        //5！ = 5 * 4 * 3 * 2 * 1;

        //核心：
        //1.找出口
        //2.找规律
        //心得：
        //方法内部再次调用方法的时候，参数必须要更加的靠近出口
        //第一次调用：5
        //第二次调用：4


        //5！ = 5 * 4!;
        //4！ = 4 * 3!;
        //3！ = 3 * 2!;
        //2！ = 2 * 1!;
        //1！ = 1;

        System.out.println(getFactorialRecursion(5));//120

    }

    public static int getFactorialRecursion(int number) {
        if (number == 1){
            //1返回给方法调用处getFactorialRecursion(1)中
            //然后层层如此直到算出结果
            //ps:视频p180 33分钟处 精准https://www.bilibili.com/video/BV17F411T7Ao?t=2023.0&p=180
            return 1;
        }else {
            return number * getFactorialRecursion( number -1);
        }
    }
}
