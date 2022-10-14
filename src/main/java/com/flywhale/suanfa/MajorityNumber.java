package com.flywhale.suanfa;

import java.util.List;

/**
 * 给定一个整型数组，找出主元素，它在数组中的出现次数大于数组元素个数的二分之一。
 */
public class MajorityNumber {

    /**
     * Boyer-Moore 投票算法
     * @param nums
     * @return
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int candidate = -1;
        int count = 0;
        for (Integer num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        int length = nums.size();
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count * 2 > length ? candidate : -1;
    }

}
