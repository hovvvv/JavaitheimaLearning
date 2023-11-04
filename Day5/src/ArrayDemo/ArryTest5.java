package ArrayDemo;

import java.util.Random;

public class ArryTest5 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = new int[10];
        //2.把随机数存入数组中
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //每循环一次，就会生成一个新的随机数
            int number = r.nextInt(99) + 1;
            //把生成的随机数添加到数组当中
            //数组名[索引] = 数据
            arr[i] = number;
        }
        //1. 求出所有数据的和
        //定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组中所有数据的和为" + sum);

        //2.求数组中的平均数
        int avg = sum / arr.length;
        System.out.println("数组中的平均数为" + avg);

        //3.有多少个数据比平均数小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("有" + count + "个数比平均数小");


        //遍历数组，验证答案
        //System.out.print删去ln将在同一行打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

