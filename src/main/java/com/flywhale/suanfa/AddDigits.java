package com.flywhale.suanfa;

/**
 * 各位相加
 *
 * 给出一个非负整数 num，反复的将所有位上的数字相加，直到得到一个一位的整数。
 */
public class AddDigits {

    public int addDigits(int num) {
        // write your code here
        int returnInt = 0;
        while(num > 0){
            returnInt += (num % 10);
            if(returnInt > 9){
                returnInt = returnInt/10 + returnInt%10;
            }
            num /= 10;
        }
        return returnInt;
    }

    public static void main(String[] args) {
        System.out.println(14 >>> 2);
    }

}
