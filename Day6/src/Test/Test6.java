package Test;

public class Test6 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        int[] arr = {1,4,6,7,84,22,33};
        boolean flag = contains(arr,33);
        System.out.println(flag);
    }
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==  number){
                return true;
            }
        }

        return false;
    }
}
//return break关键字的区别
//return：跟循环没有关系，跟方法有关，表示1结束方法，2返回结果
//如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束。

//break关键字
//跟方法没关系，结束循环或者switch的
