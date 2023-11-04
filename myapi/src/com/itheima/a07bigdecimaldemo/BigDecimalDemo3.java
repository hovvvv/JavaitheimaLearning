package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
          /*
            public BigDecimal add(BigDecimal val)                       加法
            public BigDecimal subtract(BigDecimal val)                  减法
            public BigDecimal multiply(BigDecimal val)                  乘法
            public BigDecimal divide(BigDecimal val)                    除法
            public BigDecimal divide(BigDecimal val，精确几位，舍入模式)     除法
        */

        //1.加法&&减法
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        BigDecimal add = bd1.add(bd2);
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println(add);
        System.out.println(subtract);

        //2.乘法
        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println(multiply);

        //3.除法
        //细节如果除不尽则要加上精确位数和舍入模式
        BigDecimal divide = bd1.divide(bd2,2, RoundingMode.HALF_UP);
        System.out.println(divide);
    }
}
