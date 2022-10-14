package com.flywhale.suanfa;

import java.util.Arrays;

/**
 * 给定一个数组，将数组向右移动k步，其中k为非负数。
 */
public class Rotate {

    public static int[] rotate(int[] nums, int k) {
        // Write your code here
        int count = 0;
        if(k < nums.length){
            count = k;
        }
        else{
            if(k % nums.length == 0){
                return nums;
            }
            else{
                count = k % nums.length;
            }
        }
        int[] news = Arrays.copyOf(nums, nums.length);
        System.arraycopy(nums, nums.length-count, news, 0, count);
        System.arraycopy(nums, 0, news, count, nums.length-count);
        return news;
    }

    public static void main(String[] args) {
        int arr1[]=new int []{1,2,3,4,5,6,7};
        System.out.println(rotate(arr1, 15).toString());
    }

}
