package Test;

public class Test7 {
    public static void main(String[] args) {
        //定义一个方法将数组arr中从索引from（包含from）开始。
        //到索引to结束（不包含to）的元素复制到新数组中，将新数组返回
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int[] copyArr = copyOFRange(arr,3,7);

        for (int i = 0; i < copyArr.length; i++){
            System.out.print(copyArr[i] + " ");
        }
    }
    public static int[] copyOFRange(int[] arr,int from,int to){
        //1.定义数组
        int[] newArr = new int[to - from];
        //2.把原始数组arr中的from到to上对应的元素，直接拷贝到newArr中

        //******伪造索引思想****
        int index = 0;
        for (int i = from; i < to; i++) {
            //格式：数组名[索引] = 数组值;
            newArr[index] = arr[i];
            index++;
        }
        // 把新数组返回
        return newArr;

    }
}
