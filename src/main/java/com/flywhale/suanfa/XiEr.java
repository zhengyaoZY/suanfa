package com.flywhale.suanfa;

/**
 * 希尔排序
 */
public class XiEr {

    public static void shellSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
        System.out.println(arr);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5,3,8,6,4};
        XiEr.shellSort(arr);
    }

}
