package com.flywhale.suanfa;

/**
 * 给定一个数组 nums 以及一个整数 target 。
 * 你需要把数组中等于target的元素移动到数组的最前面，并且其余的元素相对顺序不变。
 * 你的所有移动操作都应该在原数组上面操作。
 */
public class MoveTarget {

    /**
     * 使用冒泡排序来解这道题
     * @param nums
     * @param target
     */
    public void moveTarget(int[] nums, int target) {
        // write your code here
        for(int i = 1; i < nums.length; i++){
            for(int j = i ; j > 0; j--){
                if(nums[j] == target && nums[j] != nums[j-1]){
                    nums[j] = nums[j-1];
                    nums[j-1] = target;
                }else {
                    break;
                }
            }

        }
    }

}
