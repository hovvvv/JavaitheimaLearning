package com.itheima.methoddemo;

public class ReturnMethodDemo1 {
    public static void main(String[] args) {
        //带返回值方法格式：public static 返回值类型 方法名（参数）{
        // 方法体;
        // return 返回值;
        // }

        //1.直接调用
        //getsum(10,20,30);

        //2.赋值调用
        //int sum = getsum(10,20,30);
        //System.out.println(sum);

        //3.输出调用
        //System.out.println(getsum(10,20,30));

        //先计算第一季度营业额
        int sum1 = getsum(10,20,30);
        //先计算第二季度营业额
        int sum2 = getsum(10,20,30);
        //先计算第三季度营业额
        int sum3 = getsum(10,20,30);
        //先计算第四季度营业额
        int sum4 = getsum(10,20,30);

        //求全年营业额
        int sum = sum1+sum2+sum3+sum4;
        System.out.println(sum);
    }
    public static int getsum(int num1,int num2,int num3){
        int result = num1 + num2 +num3;
        return result;//返回给方法的调用处
    }
}
