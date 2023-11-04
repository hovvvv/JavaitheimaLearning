package com.itheima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //LoginJFrame 表示登陆界面
    //所有跟登录相关的代码都写在这里
    public LoginJFrame() {
        //抽取一段代码为一个方法快捷键：ctrl + alt + M
        //初始化界面
        initJFrame();
        //加载登录界面
        initImage();
    }

    private void initImage() {
        //加载用户名图片
        JLabel usernameJlabel = new JLabel(new ImageIcon("puzzlegame\\image\\login\\用户名.png"));
        usernameJlabel.setBounds(100,130,47,17);
        this.getContentPane().add(usernameJlabel);
        //添加用户名输入框
        JTextField usernamejTextField = new JTextField();
        usernamejTextField.setBounds(170,130,170,26);
        this.getContentPane().add(usernamejTextField);

        //加载密码图片
        JLabel passwordJlabel = new JLabel(new ImageIcon("puzzlegame\\image\\login\\密码.png"));
        passwordJlabel.setBounds(100,190,32,16);
        this.getContentPane().add(passwordJlabel);
        //添加密码输入框
        JTextField passwordjTextField = new JPasswordField();
        passwordjTextField.setBounds(170,190,170,26);
        this.getContentPane().add(passwordjTextField);

        //加载验证码
        JLabel captchaJlabel = new JLabel(new ImageIcon("puzzlegame\\image\\login\\验证码.png"));
        captchaJlabel.setBounds(100,250,56,21);
        this.getContentPane().add(captchaJlabel);
        //添加验证码输入框
        JTextField captchajTextField = new JTextField();
        captchajTextField.setBounds(170,240,120,26);
        this.getContentPane().add(captchajTextField);

        //添加登录按钮
        JLabel loginJLabel = new JLabel(new ImageIcon("puzzlegame\\image\\login\\登录按钮.png"));
        loginJLabel.setBounds(100,280,128,47);
        this.getContentPane().add(loginJLabel);
        //添加注册按钮
        JLabel registerJLabel = new JLabel(new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        registerJLabel.setBounds(240,280,128,47);
        this.getContentPane().add(registerJLabel);

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\login\\background.png"));
        background.setBounds(0,0,470,390);
        //把背景图片添加到界面当中
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    private void initJFrame() {
        //设置界面宽 高
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("拼图 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }




}
