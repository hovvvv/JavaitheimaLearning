package StringJoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //方法构造
        //public StringJoiner（间隔符号）
        //public StringJoiner（间隔符号，开始符号，结束符号）
        StringJoiner sj = new StringJoiner("---");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        System.out.println(sj);
    }
}
