package com.flywhale.suanfa;

/**
 * 四舍五入
 *
 * 实现对数组 array 中的正整数按照个位四舍五入，如果是负数和零就不做任何处理，最后返回这个四舍五入后的数组。
 */
public class Rounding {

    public static int[] rounding(int[] array) {
        // write your code here
        int[] returnIntArr = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] <= 0){
                returnIntArr[i] = array[i];
                continue;
            }
            int num = array[i] % 10;
            if(num <= 4){
                returnIntArr[i] = array[i] / 10 * 10;
            }else{
                returnIntArr[i] = (array[i] / 10 + 1) * 10;
            }
        }
        return returnIntArr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{101,55,4,-88,777,555};
        rounding(nums);
    }

}
