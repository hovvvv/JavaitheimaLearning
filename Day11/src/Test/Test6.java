package Test;

import java.util.ArrayList;
import java.util.Scanner;

/*需求：
1.main方法中定义一个集合，存入三个用户对象。
用户属性为：id，，username，password
2.要求：定义一个方法，根据id查找对应用户信息。
如果存在，返回true
如果不存在，返回false*/

public class Test6 {
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建用户对象添加到集合中
        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "12345678");
        User u3 = new User("heima003", "wangwu", "1234qwer");

        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.调用方法查看id是否存在
        boolean flag = contains(list, "heima003");

        //5.打印结果
        System.out.println(flag);

    }

    public static boolean contains(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                //如果找到了直接返回true
                return true;
            }
        }
        //当循环结束表示集合里面所有元素都已经比较完毕，还没有一样的，那么返回false就可以了
        return false;
    }
}