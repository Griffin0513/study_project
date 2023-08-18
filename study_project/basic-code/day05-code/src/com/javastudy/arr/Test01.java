package com.javastudy.arr;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));// [I@1b6d3586
        String[] arr2 = {"zhangsan", "lisi"};
        System.out.println(arr2);// [Ljava.lang.String;@4554617c
        double[] height = new double[]{1.1, 2.23, 1.75};
        System.out.println(height);// [D@1b6d3586

        //[ :表示数组
        //D :表示double
        //@ :固定间隔
        //1b6d3586 :真实地址值（十六进制）
        System.out.println(height[0]);
        arr1[0] = 6;
        System.out.println(arr1[0]);
        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        for (int j : arr1) {
            System.out.println(j);
        }
    }
}
