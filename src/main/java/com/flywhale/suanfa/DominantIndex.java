package com.flywhale.suanfa;

/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * 如果是，则返回最大元素的索引，否则返回-1。
 */
public class DominantIndex {



    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        int maxIndex = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                if(nums[maxIndex] * 2 <= max){
                    index = i;
                }
                maxIndex = i;
            }
        }
        if(index == maxIndex){
            return maxIndex;
        }else {
            return -1;
        }
    }

}
