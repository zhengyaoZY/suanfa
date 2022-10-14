package com.flywhale.suanfa;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 快乐数
 * 一个数是不是快乐是这么定义的：对于一个正整数，
 * 每一次将该数替换为他每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为1，或是无限循环但始终变不到1。如果可以变为1，那么这个数就是快乐数。
 */
public class HappyNum {

    public static void main(String[] args) {
        System.out.println(isHappy(5));
    }


    public static boolean isHappy(int n){
        HashSet<Integer> intSet = new HashSet<>();
        return isHappy2(n,intSet);
    }
    public static boolean isHappy2(int n, HashSet<Integer> intSet) {
        // write your code here
        if(n == 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        int num = 0;
        while (n > 9){
            num += Math.pow(n%10,2);
            n = n / 10;
        }
        num += Math.pow(n,2);
        if(intSet.contains(num)){
            return  false;
        }
        intSet.add(num);
        return isHappy2(num, intSet);
    }


}
