package com.itheima.a02SystemDemo2;

public class SystemDemo1 {
    /*
            public static void exit(int status )    终止当前运行的Java 虚拟机
            public static long currentTimeMi1lis()  返 回当前系统的时间亳秒值形式
            public static void arraycopy( 数据源数组，起始索引，目的地数组，起始索引，拷贝个数)   数组拷贝
     */
    public static void main(String[] args) {
        //方法的形参：
        //状态码：
        //0：表示当前虚拟机是正常停止
        //非0：表示当前虚拟机异常停止
        //System.exit(0);
        //System.out.println("看看我执行了吗？");
        //以拼图小游戏为例：
        //当我们需要把整个程序结束的时候，就可以调用这个方法。

        //long l = System.currentTimeMillis();
        //System.out.println(l);//1698899085899

        //拷贝数组
        //细节:
        //1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致， 否则会报错
        //2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        //arr1数组中的数据拷贝到arr2数组中
        //参数一：数据源，要拷贝的数据从哪个数组而来
        //参数二：从数据原数组中的第几个索引开始拷贝
        //参数三：目的地，我要把数据拷贝到哪个数组中
        //参数四：目的地数组的索引
        //参数五：拷贝的个数
        //System.arraycopy(arr1,0,arr2,0,10);

        //练习1：arr2 : 0 0 0 0 1 2 3 0 0 0
        //System.arraycopy(arr1,0,arr2,4,3);

        //练习2：arr2 : 0 0 7 8 9 0 0 0 0 0
        System.arraycopy(arr1,6,arr2,2,3);

        //验证
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}
