package Test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //添加元素
//        jdk5以后int Integer 之间是可以互相转化的
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            //            如果是最大索引
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.print("]");
    }
}
