package ArrayDemo;

public class ArryTest2 {
    public static void main(String[] args){

        int count = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0 ){
                count++;

            }
        }
        System.out.println("数组中能被3整除的数字有"+count+"个");

    }
}
