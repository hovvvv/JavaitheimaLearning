package Exerices;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //质数：如果一个整数只能被本身和一整除那这个数就是质数。否则这个数就是合数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        //表示最初就认为number是一个质数
        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if( number % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(number + "是一个质数");
        }
        else{
            System.out.println(number + "不是一个质数");
        }
    }
}
