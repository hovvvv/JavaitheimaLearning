package demo1;

public class Test3 {
    public static void main(String[] args) {
        double height = 8844430;
        double paper = 0.1;
        int count = 0;

        while (paper < height) {
            paper = paper * 2;
            count++;
        }
        System.out.println(count);
    }
}
