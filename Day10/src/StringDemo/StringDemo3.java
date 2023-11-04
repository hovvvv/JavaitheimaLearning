package StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();//new出来的

        String str2 = "abc";

        System.out.println(str1 == str2);
        //结论：
        //以后只要想比较字符串的内容，就必须要用String里面的方法
    }
}
