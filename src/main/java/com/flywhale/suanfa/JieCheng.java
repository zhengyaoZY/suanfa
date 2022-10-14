package com.flywhale.suanfa;

import java.util.Scanner;

/**
 * 请从标准输入流（控制台）中获取一个正整数 n，
 * 要求求出 n 的阶乘（从 1 到 n 的连续自然数相乘的积叫做阶乘，用符号 n! 表示），如 5! = 1 * 2 * 3 * 4 * 5。
 */
public class JieCheng {

    public static void main(String[] args) {
        // write your code here
        // read data from console
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // output the answer to the console according to the
        // requirements of the question
        int finalNum = 1;
        while (n > 0){
            finalNum *= n ;
            n--;
        }
        System.out.println(finalNum);
    }

}
