package demo1;

public class Test4 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int count = 0;
        while(dividend >= divisor){
            dividend = dividend - divisor;
            count++;
        }
        System.out.println(dividend);
        System.out.println(count);
    }
}
