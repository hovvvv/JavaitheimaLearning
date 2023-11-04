package ArrayDemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //格式
        //静态初始化
        //完整格式：
        //数据类型[]数组名 = new 数据类型[]{元素1，元素2，元素3...};
        //简化格式：
        //数据类型 [] 数组名 = {元素1，元素2....};

        //1.定义数组存储5个学生的年龄
        int[] arr1 = new int[]{11, 12, 13, 14, 15};
        int[] arr2 = {11, 12, 13, 14, 15};
        //2。定义数组存储3个学生姓名
        String[] arr3 = new String[]{"zhangsan", "wangwu", "lisi"};
        String[] arr4 = {"zhangsan", "wangwu", "lisi"};
        //定义数组存储4个学生身高
        double[] arr5 = new double[]{1.93, 1.80, 1.73, 1.74};
        double[] arr6 = {1.93, 1.80, 1.73, 1.74};
        System.out.println(arr5);
    }
}
