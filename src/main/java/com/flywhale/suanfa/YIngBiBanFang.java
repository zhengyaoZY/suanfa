package com.flywhale.suanfa;

/**
 * 你有 n 枚硬币，想要摆放成阶梯形状，即第 k 行恰好有 k 枚硬币。
 * 给出 n，找到可以形成的完整楼梯行数。
 * n 是一个非负整数，且在32位有符号整数范围内。
 */
public class YIngBiBanFang {

    public int arrangeCoins(int n) {
        // Write your code here
        int num = 0; //循环的次数
        int need = 0; //总共需要硬币的个数
        do {
            num ++;
            need += num;
        }while (need <= n);
        return num-1;
    }

    public static void main(String[] args) {
        YIngBiBanFang yIngBiBanFang = new YIngBiBanFang();
        System.out.println(yIngBiBanFang.arrangeCoins(10));
    }

}
