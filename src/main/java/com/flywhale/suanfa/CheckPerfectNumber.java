package com.flywhale.suanfa;

/**
 * 我们定义完美数是一个正 整数，它等于除其自身之外的所有 正 约数的总和。
 *
 * 现在，给定一个整数 n，写一个函数，当它是一个完美的数字时返回true，而当它不是时，返回fals
 */
public class CheckPerfectNumber {

    public boolean checkPerfectNumber(int num) {
        // write your code here
        int count = 0;
        for(int i = 1; i < num; i++ ){
            if(num % i == 0){
                count+=i;
            }
        }
        return count == num? true:false;

    }

}
