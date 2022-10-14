package com.flywhale.suanfa;

/**
 * 给定两个正整数X和Y，以及正整数数组nums。
 * 我们需要找到一个最大的index，使得在nums[0], nums[1], .... , nums[index]中，出现X、Y的次数相等，且至少均出现一次，返回该index。
 * 若不存在这样的index，则返回-1。
 */
public class LongestPrefix {

    public int longestPrefix(int X, int Y, int[] nums) {
        // write your code here
        int xCount = 0;
        int yCount = 0;
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == X){
                xCount++;
            }else if(nums[i] == Y){
                yCount++;
            }
            if(xCount > 0 && (xCount == yCount)){
                index = i;
            }
        }
        return index;
    }



    public static void main(String[] args) {
    }


}
