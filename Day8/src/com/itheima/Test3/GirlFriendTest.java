package com.itheima.Test3;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建对象
        GirlFriend gf1 = new GirlFriend();
        //赋值
        gf1.setName("小诗诗");
        gf1.setAge(22);
        gf1.setGender("女");


        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());



        gf1.sleep();
        gf1.eat();
    }
}
