package com.flywhale.suanfa;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

/**
 * 高精度 加法
 * 输入两个用字符串 str 表示的整数，求它们所表示的数之和。
 */
public class Sum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = new BigInteger(sc.nextLine());
        BigInteger b2 = new BigInteger(sc.nextLine());
        System.out.println(b1.add(b2));
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String n1 = sc.next();
            String n2 = sc.next();
            int i = n1.length() - 1; // 索引建立在字符串末尾
            int j = n2.length() - 1; // 索引建立在字符串末尾
            boolean needCarry = false; // 是否需要进位运算，即是否需要向上一位加一
            Stack<Integer> stack = new Stack<>(); // 使用栈是因为加法从右往左算，而输出是从左往右，栈可以刚好满足需求
            while (i >= 0 || j >= 0) { // 需要两个字符串都遍历结束
                char c1 = '0';
                char c2 = '0';
                int result = 0;
                if (i >= 0) {
                    c1 = n1.charAt(i);
                }
                if (j >= 0) {
                    c2 = n2.charAt(j);
                }
                result = (c1 - 48) + (c2 - 48) + (needCarry ? 1 : 0);
                needCarry = false;
                if (result > 9) {
                    result %= 10;
                    needCarry = true; // 此时需要进位
                }
                stack.push(result); // 入栈
                i--;
                j--;
            }
            if (needCarry) {
                // 如果需要进位，表示最后计算的值大于10,所以最高位为1
                stack.push(1);
            }
            // 遍历栈，输出，由于入栈时，是低位到高位入栈，则出栈由高位向低位，满足一般的阅读顺序
            while (!stack.empty()) {
                System.out.print(stack.pop());
            }
            // 记得输出回车换行，否则编译不通过
            System.out.println();
        }
    }

}
