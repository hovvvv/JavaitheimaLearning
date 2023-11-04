package ArrayDemo;

public class ArryDemo3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        /*
            for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }*/


        //在java中，关于数组的一个长度属性，length
        //调用方法：数组名.length
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //拓展：自动快速生成数组的遍历方式*****
        //idea提供
        //数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
