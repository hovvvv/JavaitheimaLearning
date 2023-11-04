package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    JButton jtb1 = new JButton("点击我阿");
    public MyJFrame3() {
        //设置界面的宽 高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("事件演示");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        //给整个窗体添加键盘监听
        //调用者this：本类对象，当前的界面对象，表示我要给整个界面添加监听
        //addKeyListener：表示要给本界面添加键盘监听
        //参数this：当时间被触发之后，会执行本类中的对应代码
        this.addKeyListener(this);

        //显示整个界面
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松按键");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        //获取键盘上每一个按键的编号
        int code = e.getKeyCode();
        if (code == 65) {
            System.out.println("现在按的是A");
        }else if (code == 66 ){
            System.out.println("现在按的是B");
        }
    }
}
