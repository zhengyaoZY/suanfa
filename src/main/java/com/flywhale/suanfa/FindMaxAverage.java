package com.flywhale.suanfa;

/**
 * 给定一个由n个整数组成的数组，找到给定长度k的连续子数组，该子数组具有最大平均值。你需要输出最大平均值。
 */
public class FindMaxAverage {

    /**
     * 最大平均数
     * 定义一个新的数组，用于存储nums 前缀和
     * 例如：sum[0]就是nums[0]
     * sum[1] = nums[0] + nums[1]
     * 对于位置i开始的长度为k的连续子数组之和，用前缀和表达就是Sum[i+k] - Sum[i]，取最大值求平均后输出即可；
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for(int i = 1; i <= n; i++){
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int ans = Integer.MIN_VALUE;
        for(int i = k; i <= n; i++){
            ans = Math.max(ans, sum[i] - sum[i - k]);
        }
        return ans * 1.0 / k;
    }


}
