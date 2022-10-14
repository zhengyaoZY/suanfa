package com.flywhale.suanfa;

import java.util.Scanner;

/**
 * 计算最后一个字符串的长度
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        System.out.println(strs[(strs.length - 1)].length());
    }

}
