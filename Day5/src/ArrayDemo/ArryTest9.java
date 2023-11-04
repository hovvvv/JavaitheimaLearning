package ArrayDemo;

import java.util.Random;

public class ArryTest9 {
    public static void main(String[] Args) {
        //定义一个数组，存入1~5.要求打乱数组中所有数据顺序

        //难点：如何获得数组中的随机索引*******************

        /* 索引范围0 1 2 3 4
        Random r = new Random();
         int randomIndex = r.nextInt(arr.length);
         System.out.println(randomIndex);
         */

        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着随机索引指向的元素  跟i指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
