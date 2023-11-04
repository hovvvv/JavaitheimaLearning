package ArrayDemo;

public class ArryTest4 {
    public static void main(String[] args) {

        //max值一定要是数组中的值\
        //循环开始条件为0就会与自己比影响效率，为了提高效率可以将开始条件改为1。

        // 定义数组求最大值
        int[] arr = {33, 5, 22, 44, 55};
        //暂时认为0索引为最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        int[] arr2 = {33, 5, 22, 44, 55};
        int min = arr[0];
        for (int i = 0; i < arr2.length; i++) {
            if(min > arr[i]){
                min= arr[i];
            }
        }
        System.out.println(min);
    }
}
