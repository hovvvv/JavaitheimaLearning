package Test;

public class Test2 {
    public static void main(String[] args) {
    //需求：定义一个方法，求圆的面积，将结果在方法中进行打印
        getArea(3);
    }

    public static void getArea(double r){
       double result = r * r * 3.14 ;
        System.out.println("圆的面积为："+result);
    }
}
