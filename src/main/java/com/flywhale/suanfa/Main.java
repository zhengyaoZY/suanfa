package com.flywhale.suanfa;

import java.util.Locale;

/**
 * 给出两个整数 a 和 b，请计算 a 和 b 的最大公约数，通过 System.out.println 语句输出。
 *
 * 思路解析：
 * 以两个中较小的数做循环。找出能同时被两个数整除的公约数。
 */
public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // write your code here
        // please print the greatest common divisor of a and b
        if(a == 0 || b == 0){
            System.out.println( a==0?b:a);
        }
        int max = 1;
        for(int i = 2; i <= a && i <= b; i++){
            if(a % i ==0 && b % i==0){
                max = i;
            }
        }
        System.out.println(max);
        String str1 = "I love ";
        String str2 = "China";
        String str3 = str1 + " " + str2;
        System.out.println(str3.toUpperCase(Locale.ROOT));
    }

}
