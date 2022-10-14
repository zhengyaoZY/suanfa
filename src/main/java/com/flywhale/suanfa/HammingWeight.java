package com.flywhale.suanfa;

/**
 * 写一个函数，其以无符号整数为输入，而输出对应二进制数所具有的“1”的位数（也被称为汉明权重）
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        // write your code here
        int num = 0;
        while(n > 0){
            if(n % 2 == 1){
                num++;
            }
            n = n / 2;
        }
        return num;
    }

    public int hammingWeight2(int n) {
        // write your code here
        int num = 0;
        while(n != 0){
            if((n & 1) == 1){
                num ++;
            }
            n = n >> 1;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(7));
        System.out.println(5 % 2 );
    }

}
