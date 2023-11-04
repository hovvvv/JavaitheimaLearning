package demo1;

public class HuiWengtest {
    public static void main(String[] args) {

        int x = 121;
        //定义一个临时变量记录x原始值
        int Temp = x;
        int num = 0;

        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
        System.out.println(num == Temp);



       /* int x = 10;
        //获取个位
        int ge = x % 10;
        //获取十位
        int shi = x / 10 % 10;
        //拼接
        int result = shi * 10 + ge;

        */
    }
}
