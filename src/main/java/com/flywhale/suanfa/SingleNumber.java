package com.flywhale.suanfa;

import java.util.Arrays;

/**
 * 给出 2 * n + 1个数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
 */
public class SingleNumber {


    public static int main(String[] args) {
        int[]  a = new int[5];
        int single = 0;
        for(int num : a){
            single ^= num;
        }
        return single;
    }

}
