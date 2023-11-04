package StringDemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //读题拆解法

        //1.定义两个变量，记录正确的用户名和密码
        String rightusername = "zhangsan";
        String rightpassword = "123456";

        Scanner sc = new Scanner(System.in);
        //2.键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //3.比较
            if (username.equals(rightusername) && password.equals(rightpassword)) {
                System.out.println("用户登陆成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账户" + username + "被锁定，请联系牛魔王");
                } else {
                    System.out.println("用户登陆失败，用户名或密码有误，您还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }

}