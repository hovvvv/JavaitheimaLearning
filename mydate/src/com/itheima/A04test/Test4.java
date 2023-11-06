package com.itheima.A04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //JDK7
        //规则:只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值
        //1.计算出生年月日的毫秒值
        String str = "2003年7月17日";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf1.parse(str);
        long birthdayTime = date.getTime();
        long currentTime = System.currentTimeMillis();
        long time =currentTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);


        LocalDate ld1 = LocalDate.of(2003, 7, 17);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);

    }
}
