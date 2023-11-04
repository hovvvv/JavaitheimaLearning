package ArrayDemo;

public class ArryTest8 {
    public static void main(String[] args) {
        //需求：定义一个数组，存入1，2，3，4，5。交换首位索引对应的元素。
        //交换前1，2，3，4，5
        //交换后5，4，3，2，1 ****************

        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];//1 2
            arr[i] = arr[j];//i=5 4
            arr[j] = temp;//j=1 2

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
