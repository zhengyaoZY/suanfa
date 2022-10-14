package com.flywhale.suanfa;

/**
 * 有序排列算法
 */
public class YouXu {

    public void insertionSort(int[] arr){
        //数组下标从1开始，0默认为是有序的
        for (int i =1; i<arr.length; i++){

            //记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j-1]){
                //如果当前值比对比值大，那么后移一位
                arr[j] = arr[j - 1];
                j--;
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

        }
    }

}
