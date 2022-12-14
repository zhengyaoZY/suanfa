package com.flywhale.suanfa;

/**
 * 冒泡排序
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class MaoPao {

    public int[] bubbleSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                //比较当前位和下一位的大小
                //如果大，那么进行交换
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;

    }

}
