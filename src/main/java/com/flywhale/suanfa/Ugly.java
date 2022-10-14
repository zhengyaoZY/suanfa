package com.flywhale.suanfa;

/**
 * 丑数相关
 * 丑数的定义是，只包含质因子 2, 3, 5 的正整数。比如 6, 8 就是丑数，但是 14 不是丑数因为他包含了质因子 7。
 */
public class Ugly {

    public static void main(String[] args) {
        System.out.println(isUgly(0));
    }

    /**
     * 检测一个数是不是丑数
     * @param num
     * @return
     */
    public static boolean isUgly(int num) {
        // write your code here
        if(num == 0){
            return  false;
        }
        while(num % 2 == 0){
            num = num / 2;
        }
        while(num % 3 == 0){
            num = num / 3;
        }
        while (num % 5 == 0){
            num = num / 5;
        }
        if(num == 2 || num == 3 || num ==5 || num == 1){
            return true;
        }
        return false;
    }

}
