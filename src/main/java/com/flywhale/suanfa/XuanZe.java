package com.flywhale.suanfa;

/**
 * 选择排序
 */
public class XuanZe {

    public void selectionSort(int[] arr){

        //总共要进行N-1轮的比较
        for(int i=0; i<arr.length-1; i++){
            int min = i;

            //每轮要进行N-i的比较
            //因为min=i，所以不需要进行arr[i]和arr[min]的比较。
            //j的最大值得是集合最后一位的下标，因为最后一位也得比较。所以j<arr.length
            for(int j=i+1; j<arr.length; j++){
                //查找最小值下标
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            //对于最小值进行位置交换
            if(i != min){
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }

    }

}
