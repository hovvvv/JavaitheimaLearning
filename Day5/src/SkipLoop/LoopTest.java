package SkipLoop;

import java.util.Random;

public class LoopTest {
    public static void main(String[] args){
        Random r = new Random();
        //从0开始到这个数-1 结束
        int number = r.nextInt(10) + 1;//1-10
        System.out.println(number);
    }
}
