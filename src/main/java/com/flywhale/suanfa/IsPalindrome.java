package com.flywhale.suanfa;

/**
 * 判断一个正整数是不是回文数。
 * 回文数的定义是，将这个数反转之后，得到的数仍然是同一个数。
 */
public class IsPalindrome {

    public boolean isPalindrome(int num) {
        // write your code here
        String numStr = String.valueOf(num);
        boolean returnBol = true;
        for(int i = 0; i < numStr.length()/2; i++){
            // 1234321
            // 12344321
            if(numStr.charAt(i) != numStr.charAt(numStr.length()-i-1)){
                returnBol = false;
            }
        }
        return returnBol;
    }

}
