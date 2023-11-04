package Test;

public class Test3 {
    public static void main(String[] args) {
        //目标：能区分什么时候用带返回值的方法
        //需求：定义方法，比较两个长方形的面积
        //方法的调用处如果要继续使用方法的结果就必须有返回值。如果不用，可写返回值可不写。
        double area1 = getArea(1.2,3.3);
        double area2 = getArea(2.2,2.3);
        if(area1 > area2){
            System.out.println("第一个长方形面积大");
        }
        else {
            System.out.println("第二个长方形面积大");
        }

    }
    public static double getArea(double len,double width){
        double area = len * width;
        return area;
    }

}
