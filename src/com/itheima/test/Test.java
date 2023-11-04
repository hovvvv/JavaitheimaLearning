package com.itheima.test;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //1.创建一个游戏的主界面
        //JavaBean类描述界面的
        //属性 （宽  高） 行为
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603,680);
        gameJframe.setVisible(true);
//        gameJframe.show();过时了

        //2.创建一个登录界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488,430);
        loginJframe.setVisible(true);

        //3.创建一个注册界面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);
    }
}
