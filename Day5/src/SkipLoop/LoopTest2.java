package SkipLoop;

import java.util.Scanner;
import java.util.Random;

//猜字游戏****
//注意点：生成随机数的代码不能写在循环里面
public class LoopTest2 {
    public static void main(String[] args) {
        int count = 0;
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你想要猜的数字：");
            int guessnumber = sc.nextInt();

        /*保底方法：
        count++;
        if (count ==3){
            System.out.println("猜对了");
            break;
        }
        */

            if (number > guessnumber) {
                System.out.println("小了");

            } else if (number < guessnumber) {
                System.out.println("大了");
            } else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
