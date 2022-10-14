package com.flywhale.suanfa;

import org.w3c.dom.ls.LSOutput;

/**
 * 给定一个正整数，返回相应的列标题，如Excel表中所示。
 * 1 -> A
 * 2 -> B
 * 3 -> C
 *  ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class ConvertToTitle {

    public static String convertToTitle(int n) {
        // write your code here
        StringBuilder str = new StringBuilder();

        while (n > 0) {
            n--;
            str.append ( (char) ( (n % 26) + 'A'));
            n /= 26;
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        char A = 'A';
        System.out.println((char)('A'+1));
        System.out.println(convertToTitle(28));
    }

}
