package Exerices;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入x的值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于二的整数作为x的值:");
        int x = sc.nextInt();


        for (int i = 1; i <= x; i++) {
            if(i * i == x) {
                System.out.println(i + "是x平方根的整数部分");
                break;
            }
            else if(i * i > x){
                System.out.println((i - 1) + "是x平方根的整数部分");
                break;
            }

        }
    }
}
