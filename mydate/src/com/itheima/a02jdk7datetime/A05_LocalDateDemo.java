package com.itheima.a02jdk7datetime;

import java.time.LocalDate;
import java.time.Month;

public class A05_LocalDateDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("今天的日期是:" + now);

        LocalDate ldDate = LocalDate.of(2023, 10, 1);
        System.out.println("指定日期:" + ldDate);

        int year = ldDate.getYear();
        System.out.println("year: " + year);
        //获取月//方式一:
        Month m = ldDate.getMonth();
        System.out.println(m);
        System.out.println(m.getValue());
    }
}
