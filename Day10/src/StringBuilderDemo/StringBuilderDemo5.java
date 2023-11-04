package StringBuilderDemo;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1, 2, 3};

        //2.调用数组把方法变成字符串
        String str = arrtoString(arr);
        System.out.println(str);
    }

    public static String arrtoString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
