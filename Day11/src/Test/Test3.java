package Test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Character> list = new ArrayList<>();

        //添加元素
//        jdk5以后int Integer 之间是可以互相转化的
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');


        //遍历
        System.out.print(list);

    }
}
