package ArrayDemo;

public class ArryDemo4 {
    public static void main(String[] args) {
        /*定义一个数组，来存放班级中50个学生的姓名
        姓名未知，等学生报道后再进行添加*/

        //动态化初始化
        // 格式：
        //数据类型[]数组名 = new 数据类型[数组的长度]；
        //在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
        String[] arr = new String[50];
        //添加学生
        arr[0] = "zhangsan";
        arr[1] = "lisi";

        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //数值默认初始化值的规律
        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'/u0000' 空格
        //布尔类型：默认初始化值false
        //引用数据类型：默认初始化值 null
    }
}
