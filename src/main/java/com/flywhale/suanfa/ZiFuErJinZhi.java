package com.flywhale.suanfa;

/**
 * 给一个正整数，检查它的二进制表示是否具有交替位。即，两个相邻的位总是具有不同的值。
 */
public class ZiFuErJinZhi {

    public boolean hasAlternatingBits(int n) {
        // Write your code here
        byte[] bits = Integer.toBinaryString(n).getBytes();
        for(int i = 1; i<bits.length; i++ ){
            if(bits[i] == bits[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ZiFuErJinZhi ziFuErJinZhi = new ZiFuErJinZhi();
        System.out.println(ziFuErJinZhi.hasAlternatingBits(5));
    }

}
