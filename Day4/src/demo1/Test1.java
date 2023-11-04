package demo1;

public class Test1 {
    public static void main(String[] args) {
        /*
        求1-100之间偶数的和
         */
        //1.获取1~100之间的每个数。
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //2.累加求和（先判断在求和）
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
