package com.flywhale.suanfa.unique;

/**
 * 给定一个非空的整数数组，在该数组中，有一个元素只出现了一次，其余元素均出现了两次，请找出只出现过一次的元素
 */
public class UniqueNumber {

    /**
     * 异或运算
     * 任何数和 0 做异或运算，结果仍然是原来的数。
     * 任何数和其自身做异或运算，结果是 0。
     * @param nums
     * @return
     */
    public int uniqueNumber(int nums[]) {
        int i = 0;
        for(int num: nums){
            i = i ^ num;
        }
        return i;
    }

}
