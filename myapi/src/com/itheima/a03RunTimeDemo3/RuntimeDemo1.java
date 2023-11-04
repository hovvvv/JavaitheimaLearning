package com.itheima.a03RunTimeDemo3;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            public static   Runtime getRuntime()         当前系统的运行环境对象
            public void     exit(int status )            停止虚拟机
            public int      availableProcessors( )       获得CPU的线程数
            public 1ong     maxMemory( )                 JVM能从系统中获取总内存大小(单位byte)
            public 1ong     totalMemory( )               JVM已经从系统中获取总内存大小(单位byte)
            public 1ong     freeMemory()                 JVM剩余内存大小(单位byte)
            public Process  exec(String command)         运行cmd命令
         */

        //1.获取Runtime对象
        //Runtime r1 = Runtime.getRuntime();

        //2.exit 停止虚拟机
        //Runtime.getRuntime().exit(0);

        //3.获取cpu线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //4.总内存大小，单位byte字节
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "兆");

        //5.已经从系统中获取总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "兆");

        //6.剩余内存大小(单位byte)
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "兆");

        //7.运行cmd命令
        //shutdown:关机
        //-s : 默认在1分钟之后关机
        //-s -t 指定时间 : 制定关机时间
        //-a : 取消关机操作
        //-r : 关机并重启
        Runtime.getRuntime().exec("shutdown -a");
    }
}
