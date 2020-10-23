package Day04;

import java.util.Arrays;

/**
 * @ClassName ArrayDemo
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/23
 **/

public class ArrayDemo {
    public static void main(String[] args) {
        int [] intArray={10,20,30};
        //将int[]数组按照默认格式变成字符串
        String  intStr= Arrays.toString(intArray);
        System.out.println(intStr);
        //对整形数组进行排序
        int [] array1={2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        //对字符串进行排序
        String[] array2={"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        //将一个字符串中的所有字符升序排列，并且倒序打印
        String str = "asv76agfwdfvasdfvjh";
        //如何进行升序：sort
        //必须是一个数组 ，才能使用Arrays.sort方法
        //String -->数组，用toCharArray
        char[] chars =str.toCharArray();
        //对字符数组进行升序排列
        Arrays.sort(chars);
        //倒序遍历
        for(int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]+" ");
        }
    }
}
