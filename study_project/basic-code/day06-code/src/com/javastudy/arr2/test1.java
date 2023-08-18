package com.javastudy.arr2;

public class test1 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {1,2,5,4,3,8,10,6,9,11};

        // 调用方法求最大值
        int max = getMax(arr);

        // 打印
        System.out.println(max);
    }

    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
