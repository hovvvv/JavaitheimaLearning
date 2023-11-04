package Test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("牛魔王");
        list.add("正在");
        list.add("火焰山");
        list.add("大酬宾");

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
